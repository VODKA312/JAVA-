package com.imooc;
/** 
 * ������������ϰ�������ʹ��
 * @author Surface
 *
 */
public class caculate {
	/* 
	 *��ȡ�����ܺ�
	 *��ȡ����ƽ��ֵ
	 *��ȡage1��age2�Ĳ�ֵ
	 *��ȡage1�Լ��������
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
		System.out.println("�����ܺͣ�"+sum1);
		System.out.println("ƽ�����䣺"+avg);
		System.out.println("�����ֵ��"+minus);
		System.out.println("�Լ�������䣺"+newAge);
	}

}
