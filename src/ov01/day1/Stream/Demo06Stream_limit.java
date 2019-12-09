package ov01.day1.Stream;/*
@outhor shkstart
@date 2019/12/9-9:27
*/

import java.util.stream.Stream;

public class Demo06Stream_limit {
    public static void main(String[] args) {
        String[] arr={"美羊羊","喜洋洋","懒洋洋","灰太狼","红太狼"};
        Stream<String> stream = Stream.of(arr);
        Stream<String> stream1 = stream.limit(3);
        stream1.forEach(na-> System.out.println(na));
    }
}
