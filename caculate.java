package com.imooc;
/** 
 * ������������ϰ�������ʹ��
 * @author Surface
 *
 */
public class caculate {
	/* ��Ϊ�����������ϰ
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
		/* 
		 * ��Ϊ��ֵ�������ϰ
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
		 * ��Ϊ�Ƚ����������ɹ�
		 */
		int a=16;
		double b=9.5;
		String str1="hello";
		String str2="imooc";
		System.out.println("a����b:"+(a==b));
		System.out.println("a����b:"+(a>b));
		System.out.println("aС�ڵ���b:"+(a<=b));
		System.out.println("str1����str2:"+(str1==str2));
		/*
		 * ��Ϊ�߼������С��
		 * ����ʹ���߼�ͼȥ����߼������
		 * ������ABCD�ĸ���ͶƱ�������Ǿ���ͶƱ�Ƿ�ͨ������ʱ�͵����߼�������������ֵ�ʱ���ˡ�
		 */
		boolean ap = true;
		boolean bp = false;
		boolean cp = false;
		boolean dp = true;
		System.out.println((ap && bp)+" δͨ��");
		System.out.println((ap || bp)+" ͨ��");
		System.out.println((!ap)+" δͨ��");
		System.out.println((cp ^ dp)+" ͨ��");
		/*
		 * ��Ϊ��ϵ�����������Ԫ���������ϰ��
		 * ���score���ڵ���60 ������� �������������
		 */
		int scoreperson = 68;
		String mark = (scoreperson>60)?"����":"������";
		System.out.println("���Գɼ����:"+mark);
		/*
		 * ��֤��������ȼ���С����
		 * int x = (m*8/(n+2))% m;
		 */
		int m = 5;
		int n = 7;
		int x = (m*8/(n+2))%m;
		System.out.println("m:"+m);
		System.out.println("n:"+n);
		System.out.println("x:"+x);
		//�õ��Ľ����֤���ҵĲ��룬ok
	}
	
}
