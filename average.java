package com.imooc;
import java.util.Scanner;
/*
 * ʵ�ֽ��������༶�ĸ�����ѧԱ�ĳɼ���Ϣ��Ȼ�����ÿ���༶�ģ�ѧԱ��ƽ���֣�
 * ����ѭ�������ѭ�����ư༶������
 * �ڲ�ѭ�����ڿ���ÿ���༶ѧԱ������
 */
public class average {

	public static void main(String[] args) {
		//�����������ķ���
		double sum1=0;
		double average=0;
		Scanner input = new Scanner(System.in);
		for(int classroom=1;classroom<=3;classroom++) {
			sum1=0;
			System.out.println("****�������"+classroom+"���༶�ĳɼ�****");
			for(int stu=1;stu<=4;stu++) {
				//��ʾ������Ϣ
				System.out.print("�������"+stu+"ѧ���ĳɼ�: ");
				int score = input.nextInt();
				sum1 = sum1 + score;//��¼һ������ܷ�
			}
			average = sum1/4;
			System.out.println("��"+classroom+"���༶ѧ����ƽ����Ϊ:"+average);
		}
	}
}
