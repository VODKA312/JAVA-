package com.imooc;
import java.util.Arrays;
public class method {

	/*
	 * 初试使用方法
	 */
	///定义一个方法名为printhello，实现输出功能信息
	public void print(){
				
		System.out.println("Hello World");
	}
	/*
	 * 无参无返回值方法
	 */
	public void showMyLove() {
		System.out.println("你们秀就秀，吵吵什么，我有的是对象:)");
	}
	/*
	 * 实现无参有返回值方法
	 * 定义一个叫calcAVG的方法，用来计算两门成绩的平均值，并输出平均成绩
	 */
	public double calcAvg() {
		double java = 92.5;
		double php = 83.0;
		double avg = (java+php)/2;
		//计算平均值
		return avg;
		//使用return返回值
	}
	/*
	 * 实现带参数带返回值的方法
	 * 将考试成绩排序并且输出，返回成绩的个数
	 * 实现思路：1.定义一个包含整形数组的方法，用于传入参数
	 * 2.构造一个有参有返回值的方法，传入的参数是成绩数组，传出的返回值是数组里的元素个数
	 * 3.在main函数里调用这个对象的方法，返回值存储在一个为count的int型变量里
	 */
	public int sort(int[] arr){
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		return arr.length;
	}
	/*
	 * 方法重载
	 */
	public void print1(){
		
		System.out.println("无参的print方法");
	}
	public void print1(String name){
		
		System.out.println("带有一个字符串参数的print方法，参数值为:"+name);
	}
	public void print1(int age){
		
		System.out.println("带有一个字符串参数的print方法，参数值为:"+age);
	}
	public static void main(String[] args) {
		
		//在main方法中调用print方法
		method test = new method();
		test.print();
		//创建对象，名为none;
		method none = new method();
		//调用方法
		none.showMyLove();
		//调用无参有返回值方法
		//1.调用hello对象中的avg方法，并将返回值保存在变量AVG中
		double avg = none.calcAvg();
		System.out.println("平均成绩为:"+avg);
		//创建新的数组
		int[] scores = {79,52,98,81};
		int count = none.sort(scores);
		System.out.println("共有"+count+"个成绩信息");
		//调用无参的方法
		none.print1();
		//调用字符串参数的方法
		none.print1("弱智");
		//调用整形参数的方法
		none.print1(23);
	}
}
