package com.yyt;
//导入输入类:
public class calaAngler {
    public static void main(String[] args){
        //1/输入三个顶点的坐标
        int x1=90,y1=180,x2=205,y2=85,x3=310,y3=240;
        //2.通过顶点公式计算边的长度
        double a,b,c;
        a=Math.sqrt(Math.pow(x2-x3,2)+Math.pow(y2-y3,2));
        b=Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3,2));
        c=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        //3.通过边长计算角度
        double radians_a=Math.acos((a*a-b*b-c*c)/(-2*b*c));
        double radians_b=Math.acos((b*b-a*a-c*c)/(-2*a*c));
        double radians_c=Math.acos((c*c-b*b-a*a)/(-2*b*a));
        //转成角度
        double degree_a=Math.toDegrees(radians_a);
        double degree_b=Math.toDegrees(radians_b);
        double degree_c=Math.toDegrees(radians_c);
        //打印
        System.out.println(degree_a);
        System.out.println(degree_b);
        System.out.println(degree_c);
        //考虑不构成三角形的情况
        //图形界面实现：通过顶点之间绘制直线

    }
}
