package com.imooc;

public class control {

	public static void main(String[] args) {
		
		/*
		 * 条件语句のif的练习
		 */
		int one = 20;
		if(one%2==0) {
			System.out.println("one是偶数");
		}
		/*
		 * 条件语句のifelse的练习
		 */
		int age1=25;
		if(age1>=18) {
			System.out.println("成年");
		}
		else {
			System.out.println("未成年");
		}
		/*
		 * 条件语句の多重if
		 */
		int age=25;
		if(age>60) {
			System.out.println("老年");
		}
		else if(age>40 && age<=60) {
			System.out.println("中年");
		}
		else if(age>18 && age<=40) {
			System.out.println("少年");
		}
		else {
			System.out.println("童年");
		}
		/*
		 * 条件语句之嵌套if
		 * 预赛成绩大于80分的可进入决赛，并分为男子组决赛和女子组决赛
		 */
		int score = 94;
		String sex = "女";
		if(score>80) {
			if(sex.equals("女")) {
				System.out.println("进入女子组决赛");
			}else {
				System.out.println("进入男子组决赛");
			}
		}else {
			System.out.println("很遗憾！你没有进入决赛");
		}
		/*
		 * switch语句练习
		 */
		char today='日';
		switch(today) {
		case('一'):
			System.out.println("早餐吃包子");
			break;
		case('二'):
			System.out.println("早餐吃油条");
			break;
		case('三'):
			System.out.println("早餐吃包子");
			break;
		case('四'):
			System.out.println("早餐吃油条");
			break;
		case('五'):
			System.out.println("早餐吃包子");
			break;
		case('六'):
			System.out.println("早餐吃油条");
			break;
		case('日'):
			System.out.println("吃主席套餐");
			break;
		}
		/*
		 * while语句训练
		 */
		int i=1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		/*
		 * 用do...while实现计算50以内的偶数之和
		 */
		int sum = 0;//保存1-50之间偶数的和
		int num = 2;//代表1-50之间的偶数
		do {
			sum = sum + num; //实现累加求和
			num = num + 2; //没执行一次，数值加2，方便跳到下一个偶数
		}while(num <=50);
		System.out.println("50以内的偶数之和为:"+sum);
		/*
		 * 计算1-100之间不能被3整除的数的和
		 * 实现思路：定义一个变量sum1存储和，用ii来表示1-100之间的数据，值从1开始，通过循环条件判断i是否是3的倍数，符合要求的数
		 * 保存在sum中
		 */
		int sum1=0;
		for(int ii=1;ii<=100;ii++) {//控制循环的次数
			if(ii % 3 !=0)//筛选条件
			{
				sum1=sum1+ii;
			}
		}
		System.out.println("1-100之间不能被3整除的数之和为:"+sum1);
		/*
		 * break
		 * 实现功能：循环将1-10之间的整数相加，如果累加值大于20，则跳出循环，并且输出当前的累加值
		 * 实现思路：定义一个sum保存累加值，定义一个变量保存1-10之间的整数，在循环中进行累加求和，
		 * 同时判断累计值是否带20，当大于20的时候输出值，并逃离循环
		 */
		int sum2=0;//保存累加值
		for(int iii=1;iii<=10;iii++) {
			sum2 = sum2+iii;
			if(sum2>20) {//判断是否大于20
				System.out.println("当前的累加值为:"+sum2);
				break;
			}
		}
		/*
		 * continue
		 * 求1-10之间所有偶数的和
		 */
		int sum3=0;
		for(int iiii=0;iiii<=10;iiii++) {
			if(iiii %2!=0) {
				continue;
				//跳出本次循环之后，不可能会执行程序语句块了
			}
			sum3 = sum3+iiii;
		}
		System.out.println("1-10之间所有偶数的和为:"+sum3);
		/*
		 * 多重循环，
		 * 试着用多重循环打印一个三角形
		 */
		System.out.println("打印直角三角形");
		for(int x=1;x<=3;x++) {
			for(int y=1;y<=x;y++) {
				System.out.print("*");
			}
			System.out.println();//换行
		}
		/*
		 * 判断一个数（小于10位)的位数
		 * 例如，输入999，则输出它是一个3位的数
		 */
		int number = 999;
		int count = 0;
		while(number>0) {
			number = number / 10;
			count=count+1;
		}
		System.out.println("这是一个"+count+"位数");
	}
	
}
