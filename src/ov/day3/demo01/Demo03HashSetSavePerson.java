package ov.day3.demo01;/*
@outhor shkstart
@date 2019/11/28-15:22
*/

import java.util.HashSet;

public class Demo03HashSetSavePerson {
    public static void main(String[] args) {
        HashSet<Person> set=new HashSet<>();
        Person p1=new Person("小美女",18);
        Person p2=new Person("小美女",18);
        Person p3=new Person("小美女",19);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1 == p2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.equals(p2));
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
