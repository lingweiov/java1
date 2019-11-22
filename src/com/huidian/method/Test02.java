package com.huidian.method;/*
@outhor shkstart
@date 2019/11/20-16:00
题目要求
定义一个方法：判断两个方法是否相同
*/

public class Test02 {
    public static void main(String[] args) {
        System.out.println(isSme(10,20));
        System.out.println(isSme(11,11));
        System.out.println("结果是："+getSum());
        printCount(2);
    }
    public static boolean isSme(int a,int b) {
  /*  boolean sam;
    if(a==b){
        sam=true;
    }else{
        sam=false;
    }*/
//        sam=a==b?true:false;
     boolean same=a==b;
    return same;
    }
    public static int getSum ( ){
int sum=0;
        for (int i = 0; i < 100; i++) {
            sum+=1;
        }
        return sum;
    }
    public static void   printCount(int num ){
        for (int i = 1; i <= num; i++) {
            System.out.println("HeloWorld"+i);
        }
    
    }

}
