package com.huidian.day2.demo01;/*
@outhor shkstart
@date 2019/11/21-9:25
*/

public class PhoneReturn {
    public static void main(String[] args) {
Phone two=getPhone();
        System.out.println(two.color);
        System.out.println(two.price);
        System.out.println(two.brand);

    }
    public static Phone getPhone() {
        Phone one=new Phone();

        one.brand="苹果";
        one.color="黑色";
        one.price=8760.9;
        return one;
    }
}
