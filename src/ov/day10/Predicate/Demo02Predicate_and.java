package ov.day10.Predicate;/*
@outhor shkstart
@date 2019/12/7-9:50
*/

import java.util.function.Predicate;

public class Demo02Predicate_and {
    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2) {
        //return pre1.test(s) && pre2.test(s);
       return pre1.and(pre2).test(s);
    }

    public static void main(String[] args) {
        String s = "abcdef";
        boolean b = checkString(s, (String str) -> {
            return str.length() > 5;
        }, (str) -> {
            return str.contains("a");
        });
        System.out.println(b);

    }
}
