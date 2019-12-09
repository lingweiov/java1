package ov.day10.Consumer;/*
@outhor shkstart
@date 2019/12/7-8:43
*/

import java.util.function.Consumer;

public class Demo01Consumer {
    public static void method(String name, Consumer<String> con) {
        con.accept(name);
    }

    public static void main(String[] args) {
        method("赵丽颖",(String name)->{
          //  System.out.println(name);
            String reName = new StringBuffer(name).reverse().toString();
            System.out.println(reName);
        });
    }
}
