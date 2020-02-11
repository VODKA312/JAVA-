package com.imooc;
/** 
 * 本程序用于练习运算符的使用
 * @author Surface
 *
 */
public class caculate {
	/* 
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
	}

}
