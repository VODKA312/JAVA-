package com.imooc;
import java.util.Arrays;//����JAVA�����
/*
 * ��дһ��JAVA���򣬴���ָ�����ȵ�int���飬������100���������Ϊ�����е�ÿ��Ԫ�ظ�ֵ��Ȼ���������
 * Ҫ��ͨ���в����з���ֵ�ķ���ʵ��
 * ͨ������������������
 * ���裺
 * main��������:
 * �������֣�
 */
public class practice7 {

	public static void main(String[] args) {
		//����һ���µĶ����stu
		practice7 stu = new practice7();
		//���÷��������ѷ���ֵ����������
		String array = stu.getArray(8);
		//��ӡ���
		System.out.println(array);
		
	}
	//����һ������Ϊ���ͣ��������鳤�ȣ�������ֵΪ��������/������ַ���
	public String getArray(int length) {
		//����һ������
		int[] num = new int [length];
		//ͨ��������������鸳ֵ
		for(int i=0;i<length;i++) {
			num[i]=(int)(Math.random()*100);
		}
		String Arraystring = Arrays.toString(num);
		return Arraystring;
	}
}
