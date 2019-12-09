package ov01.day1.Stream;/*
@outhor shkstart
@date 2019/12/9-9:17
*/

import java.util.stream.Stream;

public class Demo04Stream_map {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4");
        Stream<Integer> stream1 = stream.map((String s) -> {
            return Integer.parseInt(s);
        });
        stream1.forEach(i-> System.out.println(i));
    }
}
