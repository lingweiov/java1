package ov01.day1.Stream;/*
@outhor shkstart
@date 2019/12/9-11:34
*/

import java.util.stream.Stream;

public class Demo08Stream_concat {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");
        String[] arr = {"美羊羊", "喜洋洋", "懒洋洋", "灰太狼", "红太狼"};
        Stream<String> stream2 = Stream.of(arr);
        Stream<String> concat = Stream.concat(stream1, stream2);
        concat.forEach(name-> System.out.println(name));
    }
}
