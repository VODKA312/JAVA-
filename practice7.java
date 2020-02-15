package com.imooc;
import java.util.Arrays;//导入JAVA程序包
/*
 * 编写一个JAVA程序，创建指定长度的int数组，并生成100以内随机数为数组中的每个元素赋值，然后输出数组
 * 要求通过有参数有返回值的方法实现
 * 通过随机函数生成随机数
 * 步骤：
 * main函数部分:
 * 方法部分：
 */
public class practice7 {

	public static void main(String[] args) {
		//定义一个新的对象叫stu
		practice7 stu = new practice7();
		//调用方法，并把返回值保存在里面
		String array = stu.getArray(8);
		//打印结果
		System.out.println(array);
		
	}
	//定义一个参数为整型（传入数组长度），返回值为整个数组/数组的字符串
	public String getArray(int length) {
		//构建一个数组
		int[] num = new int [length];
		//通过随机函数给数组赋值
		for(int i=0;i<length;i++) {
			num[i]=(int)(Math.random()*100);
		}
		String Arraystring = Arrays.toString(num);
		return Arraystring;
	}
}
