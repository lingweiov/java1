package ov.day10.Predicate;/*
@outhor shkstart
@date 2019/12/7-11:14
*/

import java.util.function.Predicate;

public class Demo03Predicate_or {
    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2) {
        //return pre1.test(s) || pre2.test(s);
        return pre1.or(pre2).test(s);
    }

    public static void main(String[] args) {
        String s = "bca";
        boolean b = checkString(s, (String str) -> {
            return str.length() > 5;
        }, (str) -> {
            return str.contains("a");
        });
        System.out.println(b);

    }
}
