package ov01.day1.Stream;/*
@outhor shkstart
@date 2019/12/9-11:31
*/

import java.util.stream.Stream;

public class Demo07Stream_skip {
    public static void main(String[] args) {
        String[] arr = {"美羊羊", "喜洋洋", "懒洋洋", "灰太狼", "红太狼"};
        Stream<String> stream = Stream.of(arr);
        Stream<String> stream1 = stream.skip(3);
        stream1.forEach(name -> System.out.println(name));
    }
}
