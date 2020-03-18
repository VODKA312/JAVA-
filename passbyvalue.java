package com.yyt;

public class passbyvalue {
    //按值传递

    public static void main(String[] args){
        int num1=9;
        int num2=10;
        swap(num1,num2);
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);

    }
    //得确保是静态方法
    public static void swap(int num1,int num2){
        int temp=num1;
        num1=num2;
        num2=temp;
    }
}
