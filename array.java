package com.imooc;
import java.util.Arrays;
public class array {
	public static void main(String[] args) {
		//����һ�����飬������ֵ
		int[] scores = {78,93,97,84,63};
		//��������еĵڶ����ɼ�
		System.out.println("�����еĵ�2���ɼ�Ϊ:"+scores[1]);
		//����һ������Ϊ5������
		String[] subjects = new String[5];
		subjects[0]="oracle";
		subjects[1]="PHP";
		subjects[2]="Linux";
		subjects[3]="Java";
		subjects[4]="HTML";
		System.out.println("�����е��ĸ���ĿΪ:"+subjects[3]);
		String[] hobbys = new String[] {"sports","game","movie"};
		System.out.println("ѭ�����������Ԫ�ص�ֵ:");
		//ʹ��ѭ�����������е�Ԫ��
		for(int i=0;i<hobbys.length;i++) {
			System.out.println(hobbys[i]);
		}
		/*
		 * ����Ҫ�󣺶���һ���������飬������ֵ61,23,4,74,13,148,20
		 * ����������������ֵ����Сֵ���ۼ�ֵ��ƽ��ֵ
		 * �������һ��Ԫ�ؼ�Ϊ���ֵ��Ϊ��Сֵ
		 * ʹ��forѭ���������飬�ֱ���ٶ������ֵ����Сֵ�Ƚϣ�����ȼٶ������ֵ�����滻����֮������ȼٶ�����СֵС���滻
		 * ����ѭ��ִ�й����ж������е�Ԫ�ؽ����ۼ����
		 * ѭ�����������ۼӼ���ƽ��ֵ������ӡ����������
		 */
		int[] nums = new int[] {61,23,4,74,13,148,20};
		int max = nums[0];
		int min = nums[0];
		double sum = 0;
		double avg = 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max) {
				max=nums[i];
			}
			if(nums[i]<min) {
				min=nums[i];
			}
			sum = sum+nums[i];
		}
		avg = sum/7;
		System.out.println("�����е����ֵΪ: "+max);
		System.out.println("�����е���СֵΪ: "+min);
		System.out.println("�����е�ƽ��ֵΪ: "+avg);
		//����һ���ַ�������
		String[] hobbies = new String[] {"sports","game","movie"};
		//ʹ��Arrays���sort����������������
		Arrays.sort(hobbies);
		//ʹ��Arrays���toString����������ת��Ϊ�ַ������
		System.out.println(Arrays.toString(hobbies));
		/*
		 * ʹ��foreach������������
		 */
		//����һ���������飬����ɼ���Ϣ
		int [] scores1 = new int[] {89,72,64,58,93};
		//ʹ��arrays��������������
		Arrays.sort(scores1);
		//ʹ��foreach����ѭ����������е�Ԫ��
		for(int score:scores1) {//������һ���±�������������
			System.out.println(score);
		}
		/*
		 * ���ж�ά����ı��
		 */
		//�����������еĶ�ά���鲢��ֵ
		String [][] names = {{"tom","jack","mike"},{"zhangshan","lisi","wangwu"}};
		System.out.println(names.length);
		//ͨ������ѭ�������ά������Ԫ�ص�ֵ
		for(int i=0;i<names.length;i++) {
			for(int j=0;j<names[i].length;j++) {
				System.out.println(names[i][j]);
			}
			System.out.println();
		}
	}
}
