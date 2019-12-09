package ov01.day1.Stream;/*
@outhor shkstart
@date 2019/12/9-8:58
*/

import java.util.stream.Stream;

public class Demo02Stream_foreach {
    public static void main(String[] args) {
        Stream<String> str = Stream.of("张三", "李四", "王五", "赵六", "田七");
       /* str.forEach((String name) -> {
            System.out.println(name);
        });*/
        str.forEach(name -> System.out.println(name));


    }
}
