package com.huidian.day2.demo05ArrayShuZu;/*
@outhor shkstart
@date 2019/11/21-16:41
*/

public class Demo01Array {
    public static void main(String[] args) {
        Person[] arr = new Person[3];
        Person one = new Person("张三", 19);
        Person two = new Person();
        two.setName("李四");
        two.setAge(23);
        Person three = new Person();
        three.setAge(34);
        three.setName("王五");
        arr[0] = one;
        arr[1] = two;
        arr[2] = three;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //Person person=arr[1];
        System.out.println(arr[1].getName());


    }


}
