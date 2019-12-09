package ov.day2.demo01.Generic;/*
@outhor shkstart
@date 2019/11/27-15:49
*/

public class Demo01GenericClass {
    public static void main(String[] args) {
        GenericClass gc = new GenericClass();
        gc.setName("只能是字符串");
       /* String name = gc.getName();
        System.out.println(name);*/
        Object obj = gc.getName();
        System.out.println(obj);
        System.out.println("====================");
        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(1);
        Integer name = gc2.getName();
        System.out.println(name);
        System.out.println("=======================");
        GenericClass<String> gc3 = new GenericClass<>();
        gc3.setName("张三");
        String name3 = gc3.getName();
        System.out.println(name3+"->"+name3.length());
    }
}
