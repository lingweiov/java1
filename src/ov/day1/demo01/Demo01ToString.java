package ov.day1.demo01;/*
@outhor shkstart
@date 2019/11/26-11:32
*/

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Demo01ToString {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("张三");
        person.setAge(12);
        System.out.println(person.toString());
        System.out.println(person);
        Random r=new Random();
        System.out.println(r);
        Scanner sc=new Scanner(System.in);
        System.out.println(sc);
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.toString());

    }
}
