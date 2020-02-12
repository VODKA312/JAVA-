package com.imooc;
/** 
 * 本程序用于练习运算符的使用
 * @author Surface
 *
 */
public class caculate {
	/* 此为算数运算符练习
	 *求取年龄总和
	 *求取年龄平均值
	 *求取age1和age2的差值
	 *求取age1自减后的年龄
	 * */
	public static void main(String[] args) {
		int age1=24;
		int age2=18;
		int age3=36;
		int age4=27;
		int sum1=age1+age2+age3+age4;
		float avg=sum1/4;
		int minus=age1-age2;
		int newAge=--age1;
		System.out.println("年龄总和："+sum1);
		System.out.println("平均年龄："+avg);
		System.out.println("年龄差值："+minus);
		System.out.println("自减后的年龄："+newAge);
		/* 
		 * 此为赋值运算符练习
		 * three = one+two ==> 30
		 * three += one ==> 40
		 * three -= one ==> 30
		 * three *= one ==> 300
		 * three /= one ==> 30
		 * three % one ==> 0*/
		int one =10;
		int two = 20;
		int three = 0;
		three = one+two;
		System.out.println("three = one + two ==> "+three);
		three += one;
		System.out.println("three += one ==> "+three);
		three -= one;
		System.out.println("three -= one ==> "+three);
		three *= one;
		System.out.println("three *= one ==> "+three);
		three /= one;
		System.out.println("three /= one ==> "+three);
		three %= one;
		System.out.println("three %= one ==> "+three);
		/*
		 * 此为比较运算符运算成果
		 */
		int a=16;
		double b=9.5;
		String str1="hello";
		String str2="imooc";
		System.out.println("a等于b:"+(a==b));
		System.out.println("a大于b:"+(a>b));
		System.out.println("a小于等于b:"+(a<=b));
		System.out.println("str1等于str2:"+(str1==str2));
		/*
		 * 此为逻辑运算符小测
		 * 可以使用逻辑图去理解逻辑运算符
		 * 假设有ABCD四个人投票，由他们决定投票是否通过，此时就到了逻辑运算符大显身手的时候了。
		 */
		boolean ap = true;
		boolean bp = false;
		boolean cp = false;
		boolean dp = true;
		System.out.println((ap && bp)+" 未通过");
		System.out.println((ap || bp)+" 通过");
		System.out.println((!ap)+" 未通过");
		System.out.println((cp ^ dp)+" 通过");
		/*
		 * 此为关系运算符（即三元运算符的练习）
		 * 如果score大于等于60 输出及格 否则输出不及格
		 */
		int scoreperson = 68;
		String mark = (scoreperson>60)?"及格":"不及格";
		System.out.println("考试成绩如何:"+mark);
		/*
		 * 验证运算符优先级的小测试
		 * int x = (m*8/(n+2))% m;
		 */
		int m = 5;
		int n = 7;
		int x = (m*8/(n+2))%m;
		System.out.println("m:"+m);
		System.out.println("n:"+n);
		System.out.println("x:"+x);
		//得到的结果验证了我的猜想，ok
	}
	
}
