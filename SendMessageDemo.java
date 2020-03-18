package com.yyt;
//喊话程序
import java.util.concurrent.TimeUnit;
//目的：汉化的定义
public class SendMessageDemo {
    public static void main(String[] args){
        SendMessage("杨二狗","祖安人民大舞台","你的乌龙玛奇朵送到了！",10,3);
    }
    public static void SendMessage(String name,String channelName,String message,int count,int frequency){
        //输入姓名，频道名称，消息，数目，频率
        //message:喊话内容
        //count:喊话次数
        //frequency:喊话的时间间隔
        //拼接字符串
        String value = String.format("[%s]%s,%s",channelName,name,message);
        for(int i=0;i<count;i++){
            System.out.println(value);
            try{
                //Thread.sleep(frequency * 100);
                //直接使用秒
                TimeUnit.SECONDS.sleep(frequency);
            }catch(InterruptedException e){
                e.printStackTrace();
            }//catch部分是错误处理
        }
    }

}
