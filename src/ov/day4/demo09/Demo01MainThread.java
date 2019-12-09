package ov.day4.demo09;/*
@outhor shkstart
@date 2019/11/29-20:39
*/

public class Demo01MainThread {
    public static void main(String[] args) {
        Person p1 = new Person("小强");
        p1.run();
        Person p2 = new Person("小七");
        p2.run();

    }
}

