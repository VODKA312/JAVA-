package com.imooc;

public class control {

	public static void main(String[] args) {
		
		/*
		 * ��������if����ϰ
		 */
		int one = 20;
		if(one%2==0) {
			System.out.println("one��ż��");
		}
		/*
		 * ��������ifelse����ϰ
		 */
		int age1=25;
		if(age1>=18) {
			System.out.println("����");
		}
		else {
			System.out.println("δ����");
		}
		/*
		 * �������ζ���if
		 */
		int age=25;
		if(age>60) {
			System.out.println("����");
		}
		else if(age>40 && age<=60) {
			System.out.println("����");
		}
		else if(age>18 && age<=40) {
			System.out.println("����");
		}
		else {
			System.out.println("ͯ��");
		}
		/*
		 * �������֮Ƕ��if
		 * Ԥ���ɼ�����80�ֵĿɽ������������Ϊ�����������Ů�������
		 */
		int score = 94;
		String sex = "Ů";
		if(score>80) {
			if(sex.equals("Ů")) {
				System.out.println("����Ů�������");
			}else {
				System.out.println("�������������");
			}
		}else {
			System.out.println("���ź�����û�н������");
		}
		/*
		 * switch�����ϰ
		 */
		char today='��';
		switch(today) {
		case('һ'):
			System.out.println("��ͳ԰���");
			break;
		case('��'):
			System.out.println("��ͳ�����");
			break;
		case('��'):
			System.out.println("��ͳ԰���");
			break;
		case('��'):
			System.out.println("��ͳ�����");
			break;
		case('��'):
			System.out.println("��ͳ԰���");
			break;
		case('��'):
			System.out.println("��ͳ�����");
			break;
		case('��'):
			System.out.println("����ϯ�ײ�");
			break;
		}
		/*
		 * while���ѵ��
		 */
		int i=1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		/*
		 * ��do...whileʵ�ּ���50���ڵ�ż��֮��
		 */
		int sum = 0;//����1-50֮��ż���ĺ�
		int num = 2;//����1-50֮���ż��
		do {
			sum = sum + num; //ʵ���ۼ����
			num = num + 2; //ûִ��һ�Σ���ֵ��2������������һ��ż��
		}while(num <=50);
		System.out.println("50���ڵ�ż��֮��Ϊ:"+sum);
		/*
		 * ����1-100֮�䲻�ܱ�3���������ĺ�
		 * ʵ��˼·������һ������sum1�洢�ͣ���ii����ʾ1-100֮������ݣ�ֵ��1��ʼ��ͨ��ѭ�������ж�i�Ƿ���3�ı���������Ҫ�����
		 * ������sum��
		 */
		int sum1=0;
		for(int ii=1;ii<=100;ii++) {//����ѭ���Ĵ���
			if(ii % 3 !=0)//ɸѡ����
			{
				sum1=sum1+ii;
			}
		}
		System.out.println("1-100֮�䲻�ܱ�3��������֮��Ϊ:"+sum1);
		/*
		 * break
		 * ʵ�ֹ��ܣ�ѭ����1-10֮���������ӣ�����ۼ�ֵ����20��������ѭ�������������ǰ���ۼ�ֵ
		 * ʵ��˼·������һ��sum�����ۼ�ֵ������һ����������1-10֮�����������ѭ���н����ۼ���ͣ�
		 * ͬʱ�ж��ۼ�ֵ�Ƿ��20��������20��ʱ�����ֵ��������ѭ��
		 */
		int sum2=0;//�����ۼ�ֵ
		for(int iii=1;iii<=10;iii++) {
			sum2 = sum2+iii;
			if(sum2>20) {//�ж��Ƿ����20
				System.out.println("��ǰ���ۼ�ֵΪ:"+sum2);
				break;
			}
		}
		/*
		 * continue
		 * ��1-10֮������ż���ĺ�
		 */
		int sum3=0;
		for(int iiii=0;iiii<=10;iiii++) {
			if(iiii %2!=0) {
				continue;
				//��������ѭ��֮�󣬲����ܻ�ִ�г���������
			}
			sum3 = sum3+iiii;
		}
		System.out.println("1-10֮������ż���ĺ�Ϊ:"+sum3);
		/*
		 * ����ѭ����
		 * �����ö���ѭ����ӡһ��������
		 */
		System.out.println("��ӡֱ��������");
		for(int x=1;x<=3;x++) {
			for(int y=1;y<=x;y++) {
				System.out.print("*");
			}
			System.out.println();//����
		}
		/*
		 * �ж�һ������С��10λ)��λ��
		 * ���磬����999�����������һ��3λ����
		 */
		int number = 999;
		int count = 0;
		while(number>0) {
			number = number / 10;
			count=count+1;
		}
		System.out.println("����һ��"+count+"λ��");
	}
	
}
