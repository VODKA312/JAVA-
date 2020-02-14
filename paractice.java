package com.imooc;

public class paractice {
 
	public static void main(String[] args) {
		
		/*
		 * 功能描述：为指定成绩加分，知道分数大于等于60为止，输出加分前和加分后的成绩，
		 * 并统计加分的次数
		 */
		int score = 53;//变量保存成绩
		System.out.println("加分前的成绩:"+score);
		int count = 0;//变量保存加分的次数
		while(score <60) {
			score = score+1;
			count = count+1;
		}
		System.out.println("加分后的成绩:"+score);
		System.out.println("共加了"+count+"次");
	}
	
}
