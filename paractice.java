package com.imooc;

public class paractice {
 
	public static void main(String[] args) {
		
		/*
		 * ����������Ϊָ���ɼ��ӷ֣�֪���������ڵ���60Ϊֹ������ӷ�ǰ�ͼӷֺ�ĳɼ���
		 * ��ͳ�ƼӷֵĴ���
		 */
		int score = 53;//��������ɼ�
		System.out.println("�ӷ�ǰ�ĳɼ�:"+score);
		int count = 0;//��������ӷֵĴ���
		while(score <60) {
			score = score+1;
			count = count+1;
		}
		System.out.println("�ӷֺ�ĳɼ�:"+score);
		System.out.println("������"+count+"��");
	}
	
}
