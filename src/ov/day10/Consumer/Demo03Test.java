package ov.day10.Consumer;/*
@outhor shkstart
@date 2019/12/7-9:21
*/

import java.util.function.Consumer;

public class Demo03Test {
    public static void printInfo(String[] arr, Consumer<String> con1,Consumer<String> con2) {
        for (String message : arr) {
            con1.andThen(con2).accept(message);
        }
    }
    public static void main(String[] args) {
        String[] arr={"迪丽热巴,女","古力娜扎,女","玛尔扎哈,男"};
    printInfo(arr,(m)->{
        String name = m.split(",")[0];
        System.out.print("姓名："+name);
    },(m)->{
        String age = m.split(",")[1];
        System.out.println(".年龄 ："+age+".");

    });
    }
}
