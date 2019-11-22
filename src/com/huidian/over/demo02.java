package com.huidian.over;/*
@outhor shkstart
@date 2019/11/20-17:10
*/

public class demo02 {
    public static void main(String[] args) {

    }
    public static boolean isSame(byte a,byte b) {
    boolean same;
    if(a==b){
        same=true;
    }else{
        same=false;
    }
    return same;
    }
    public static boolean isSame (short a,short b ){
        boolean same=a==b?true:false;
        return same;

    }
    public static boolean isSame(int a,int b ){
    return a==b;
    }
    public static boolean isSame (long a,long b ){
if(a==b){
    return true;
}else{
    return false;
}
    }
}
