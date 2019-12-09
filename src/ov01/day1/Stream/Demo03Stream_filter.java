package ov01.day1.Stream;/*
@outhor shkstart
@date 2019/12/9-9:06
*/

import java.util.stream.Stream;

public class Demo03Stream_filter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");
        Stream<String> stream2 = stream.filter((String name) -> {
            return name.startsWith("张");
        });
        stream2.forEach(name->{
            System.out.println(name);
        });
       /* stream.forEach(name->{
            System.out.println(name);
        });*///stream has already been operated upon or closed


    }
}
