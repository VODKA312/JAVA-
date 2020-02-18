package com.company;
/*
设置为private类型，是因为不希望用户从外部直接获得数据信息，这样的行为是危险的
如果改为public，就使得用户可以随便修改数据，破坏了函数的封装性
用户只能通过接口方法获得用户信息
 */
public class Array {
    //设置私有的数组成员变量data
    private int[] data;
    //设置成员变量size，指向有效的元素
    //capacity=data.length,没必要重建一个变量
    private int size;
    //用户希望开辟多大的空间就传多大的值，由传入的capacity参数决定
    public Array(int capacity){
        //开辟空间，空间由传来的capcatity决定
        //相当于把我们之前一句话的东西拆开成两句话了
        data = new int[capacity];
        size = 0;
    }
    //无参数的默认函数，设置传进来的默认值
    public Array(){
        //传进来默认值为10
        this(10);
    }
    //获取数组的元素个数
    public int getSize(){
        return size;
    }
    //获取数组的元素
    public int getCapacity(){
        return data.length;
    }
    //查询数组是否为0，返回一个布尔值
    public boolean isEmpty(){
        return size==0;
    }
    /*
    这里的部分开始是向数组中添加元素
     */
    //在所有元素后添加一个元素，具体由e当参数承载用户传进来的参数
    /*
    public void addLast(int e){
        //如果遇到数组满，不能继续追加元素的情况怎么办
        if(size==data.length){
            //抛出错误信息
            throw new IllegalArgumentException("AddLast failed.Array is full");
        }
        //这时候size还没有变，size指向哪里，数组就给哪里赋值
        data[size]=e;
        //赋值之和，size++，指针后移
        size++;
        //也可以写成data[size++]=e;
        //但最好每行只执行一个内容
    }
     */
    //实际上我们可以用方法复用的方式调用这些方法
    public void addLast(int e){
        add(size,e);
    }
    //在列表头加入元素
    public void addFirst(int e){
        add(0,e);
    }
    /*
    如果遇到要在指定位置中追加元素的情况怎么办，既不能舍弃原来的元素，又不能操作失败
    步骤：1.首先将最后一个元素移到size所指的位置
    2.继续移，直到能移出指定的位置
    3.在指定的位置给元素赋值
    4.在这完成以后size++
     */
    //在index位置中插入元素e
    public void add(int index,int e){
        //如果遇到数组满，不能继续追加元素的情况怎么办
        if(size==data.length){
            //抛出错误信息
            throw new IllegalArgumentException("Add failed.Array is full");
        }
        //判断index是否合法
        if(index<0 || index>size){
            throw new IllegalArgumentException("Add failed,Require index>=0 or index<=size");
        }
        //对于每个元素都进行后移
        for(int i=size-1;i>= index;i--){
            data[i+1]=data[i];//把data[i]的值赋给data[i+1];
            //此时index不为空，只是副本已经移动或者复制
        }
        //这个时候已经腾出空间，就能进行赋值
        data[index]=e;
        //最后不要忘了把size指针指向下一个下标的位置
        size++;
    }
}
