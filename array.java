package com.imooc;
import java.util.Arrays;
public class array {
	public static void main(String[] args) {
		//定义一个数组，保存数值
		int[] scores = {78,93,97,84,63};
		//输出数组中的第二个成绩
		System.out.println("数组中的第2个成绩为:"+scores[1]);
		//定义一个长度为5的数组
		String[] subjects = new String[5];
		subjects[0]="oracle";
		subjects[1]="PHP";
		subjects[2]="Linux";
		subjects[3]="Java";
		subjects[4]="HTML";
		System.out.println("数组中第四个科目为:"+subjects[3]);
		String[] hobbys = new String[] {"sports","game","movie"};
		System.out.println("循环输出数组中元素的值:");
		//使用循环遍历数组中的元素
		for(int i=0;i<hobbys.length;i++) {
			System.out.println(hobbys[i]);
		}
		/*
		 * 任务要求：定义一个整形数组，并赋初值61,23,4,74,13,148,20
		 * 定义变量并保存最大值，最小值，累加值和平均值
		 * 并假设第一个元素即为最大值又为最小值
		 * 使用for循环遍历数组，分别与假定的最大值和最小值比较，如果比假定的最大值大，则替换，反之，如果比假定的最小值小，替换
		 * 并且循环执行过程中对数组中的元素进行累加求和
		 * 循环结束根据累加计算平均值，并打印输出相关内容
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
		System.out.println("数组中的最大值为: "+max);
		System.out.println("数组中的最小值为: "+min);
		System.out.println("数组中的平均值为: "+avg);
		//定义一个字符串数组
		String[] hobbies = new String[] {"sports","game","movie"};
		//使用Arrays类的sort方法对他进行排序
		Arrays.sort(hobbies);
		//使用Arrays类的toString方法将数组转化为字符串输出
		System.out.println(Arrays.toString(hobbies));
		/*
		 * 使用foreach方法操作数组
		 */
		//定义一个整形数组，保存成绩信息
		int [] scores1 = new int[] {89,72,64,58,93};
		//使用arrays类对数组进行排序
		Arrays.sort(scores1);
		//使用foreach遍历循环输出数组中的元素
		for(int score:scores1) {//定义了一个新变量来遍历数组
			System.out.println(score);
		}
		/*
		 * 进行二维数组的编程
		 */
		//定义两行三列的二维数组并赋值
		String [][] names = {{"tom","jack","mike"},{"zhangshan","lisi","wangwu"}};
		System.out.println(names.length);
		//通过二重循环输出二维数组中元素的值
		for(int i=0;i<names.length;i++) {
			for(int j=0;j<names[i].length;j++) {
				System.out.println(names[i][j]);
			}
			System.out.println();
		}
	}
}
