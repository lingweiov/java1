package com.huidian.day2.demo01;/*
@outhor shkstart
@date 2019/11/21-8:46
*/

public class Phone {
    String brand;
    double price;
    String color;
     public void call(String who){
         System.out.println("给"+who+"打电话");
     }
     public  void sendMessage(){
         System.out.println("群发短信");
     }
}
