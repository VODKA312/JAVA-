package com.imooc;
import java.util.Arrays;
public class method {

	/*
	 * ����ʹ�÷���
	 */
	///����һ��������Ϊprinthello��ʵ�����������Ϣ
	public void print(){
				
		System.out.println("Hello World");
	}
	/*
	 * �޲��޷���ֵ����
	 */
	public void showMyLove() {
		System.out.println("��������㣬����ʲô�����е��Ƕ���:)");
	}
	/*
	 * ʵ���޲��з���ֵ����
	 * ����һ����calcAVG�ķ����������������ųɼ���ƽ��ֵ�������ƽ���ɼ�
	 */
	public double calcAvg() {
		double java = 92.5;
		double php = 83.0;
		double avg = (java+php)/2;
		//����ƽ��ֵ
		return avg;
		//ʹ��return����ֵ
	}
	/*
	 * ʵ�ִ�����������ֵ�ķ���
	 * �����Գɼ���������������سɼ��ĸ���
	 * ʵ��˼·��1.����һ��������������ķ��������ڴ������
	 * 2.����һ���в��з���ֵ�ķ���������Ĳ����ǳɼ����飬�����ķ���ֵ���������Ԫ�ظ���
	 * 3.��main����������������ķ���������ֵ�洢��һ��Ϊcount��int�ͱ�����
	 */
	public int sort(int[] arr){
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		return arr.length;
	}
	/*
	 * ��������
	 */
	public void print1(){
		
		System.out.println("�޲ε�print����");
	}
	public void print1(String name){
		
		System.out.println("����һ���ַ���������print����������ֵΪ:"+name);
	}
	public void print1(int age){
		
		System.out.println("����һ���ַ���������print����������ֵΪ:"+age);
	}
	public static void main(String[] args) {
		
		//��main�����е���print����
		method test = new method();
		test.print();
		//����������Ϊnone;
		method none = new method();
		//���÷���
		none.showMyLove();
		//�����޲��з���ֵ����
		//1.����hello�����е�avg��������������ֵ�����ڱ���AVG��
		double avg = none.calcAvg();
		System.out.println("ƽ���ɼ�Ϊ:"+avg);
		//�����µ�����
		int[] scores = {79,52,98,81};
		int count = none.sort(scores);
		System.out.println("����"+count+"���ɼ���Ϣ");
		//�����޲εķ���
		none.print1();
		//�����ַ��������ķ���
		none.print1("����");
		//�������β����ķ���
		none.print1(23);
	}
}
