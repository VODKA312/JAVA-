package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //申明数组，开辟空间，说明可以装多少个数组
        int[] arr = new int[10];
        //对数组赋值,且它的值为自己的下标号
        //不建议使用i<10这种硬编码的方式，使用arr.length更为灵活
        for(int i=0;i<arr.length;i++){
            arr[i]=i;
        }
        //另一种方法开辟空间
        int [] scores = new int[]{100,99,66};
        for(int i=0;i<scores.length;i++){
            //打印每个数组
            System.out.println(scores[i]);
        }
        //另一种语法：foreach
        System.out.println("发现卷子判错了");
        scores[0]=70;
        for(int score:scores){
            System.out.println(score);
        }


        }
    }
