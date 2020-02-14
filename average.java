package com.imooc;
import java.util.Scanner;
/*
 * 实现接收三个班级的各四名学员的成绩信息，然后计算每个班级的（学员的平均分）
 * 二重循环：外层循环控制班级的数量
 * 内层循环用于控制每个班级学员的数量
 */
public class average {

	public static void main(String[] args) {
		//定义这个对象的方法
		double sum1=0;
		double average=0;
		Scanner input = new Scanner(System.in);
		for(int classroom=1;classroom<=3;classroom++) {
			sum1=0;
			System.out.println("****请输入第"+classroom+"个班级的成绩****");
			for(int stu=1;stu<=4;stu++) {
				//提示输入信息
				System.out.print("请输入第"+stu+"学生的成绩: ");
				int score = input.nextInt();
				sum1 = sum1 + score;//记录一个班的总分
			}
			average = sum1/4;
			System.out.println("第"+classroom+"个班级学生的平均分为:"+average);
		}
	}
}
