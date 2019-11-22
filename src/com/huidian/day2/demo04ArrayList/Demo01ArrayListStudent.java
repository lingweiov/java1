package com.huidian.day2.demo04ArrayList;/*
@outhor shkstart
@date 2019/11/21-15:19
*/

import java.util.ArrayList;

public class Demo01ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Student one=new Student("张三",20);
        Student two=new Student("李四" ,23);
        Student three=new Student("王五",28);
        Student four=new Student("刘通",29);
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        for (int i = 0; i < list.size(); i++) {
       Student stu=list.get(i);
            System.out.println("姓名"+stu.getName()+",年龄"+stu.getAge());
        }
                

    }
}
