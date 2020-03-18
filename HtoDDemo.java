package com.yyt;
import java.util.Scanner;
//16进制转10进制程序
//步骤:
//1.让用户输入一个10进制数字
//2.调用方法，转化进制
//3.再将16进制数字转化回10进制
public class HtoDDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整形数字:");
        int decNum = input.nextInt();
        //将10进制转化为16进制
        System.out.println("16进制转化的结果为:"+HexToDec(decNum)+"H");
        //将16进制转化为10进制
        System.out.println(DectoHex(HexToDec(decNum))+"D");
    }
    //传入输入的数字，返回值为字符串
    //10进制转化为16进制，45/16取余数,然后进位
    public static String HexToDec(int decNum){
        String hex = "";//初始化字符串为空
        while(decNum !=0){
            int temp = decNum % 16;//取余数
            //余数可能是0-9之间的数字，或者是10-15之间的数字
            //10A 11B 12C 13D 14E 15F
            if(temp >=0 && temp<=9){
                hex = temp + hex;//累加并且往前推
            }
            else if(temp>=10 && temp<=15){
                //有两种办法，一种依据值进行判断，另一种直接将其转化为字符串
                //把数字转化为字符再拼接
                hex = (char)(temp - 10 + 'A' )+hex;//或者取余,然后强制字符转化
            }
            //进行下一轮
            decNum=decNum/16;
        }
        return hex;
    }
    /*
    * 16进制转化为10进制
    * 传入要转化的16进制字符串，输出10进制数字
     */
    public static int DectoHex(String hexNum){
        int decNum = 0;
        //6E -> 6*16^1+E*16^0
        //需要遍历16进制字符串
        //把传进来的字符串当成字符数组
        //如果数组有元素下标为i,那么最后一个元素下标为n-i-1,其中n为hexNum.length
        for(int i=0;i<hexNum.length();i++){
            //取出字符串中的每一个字符进行转化
            char tempChar = hexNum.charAt(i);//取字符串中第i个字符
            //两种情况：字符0-9，字符A-F
            if(tempChar>='0' && tempChar<='9'){
                decNum += (tempChar-'0')* Math.pow(16,hexNum.length()-i-1);
            }else if(tempChar >= 'A' && tempChar <= 'F'){
                decNum += (tempChar-'A' + 10)* Math.pow(16,hexNum.length()-i-1);
            }
        }
        return  decNum;
    }
}
