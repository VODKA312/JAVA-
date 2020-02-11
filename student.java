package com.imooc;

public class student {
	public static void main(String[] args) {
		//JAVA的数据类型
		String name = "天底下最爱慕课的男人";
		char sex = '男';
		int num = 18;
		double price=120.1555;
		boolean isOK = true;
		System.out.println(name);
		System.out.println(sex);
		System.out.println(num);
		System.out.println(price);
		System.out.println(isOK);
		//JAVA的自动数据转化
		double avg1=78.5;
		int rise=5;
		double avg2=avg1+rise;
		System.out.println("考试平均分："+avg1);
		System.out.println("调整后的平均分："+avg2);
		//JAVA的强制数据转化
		double HeightAvg1 = 176.2;
		int HeightAvg2 = (int)HeightAvg1;
		System.out.println("天底下最爱慕课的男人的身高是:"+HeightAvg1);
		System.out.println("取整后为:"+HeightAvg2);
	}
}
