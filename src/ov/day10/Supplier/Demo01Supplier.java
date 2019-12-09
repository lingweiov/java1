package ov.day10.Supplier;/*
@outhor shkstart
@date 2019/12/6-23:05
*/

import java.util.function.Supplier;

public class Demo01Supplier {
    public static String getString(Supplier<String> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        String s = getString(() -> {
            return "胡歌";
        });
        System.out.println(s);
        String s2 = getString(() -> "胡歌");
        System.out.println(s2);
    }
}
