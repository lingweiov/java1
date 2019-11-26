package com.huidian.day3.demo08;/*
@outhor shkstart
@date 2019/11/22-23:19
*/

public class Demo01Phone {
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.call();
        phone.send();
        phone.show();
        System.out.println("============");
        NewPhone newPhone=new NewPhone();
        newPhone.call();
        newPhone.send();
        newPhone.show();
    }
}
