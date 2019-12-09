package ov.day10.Predicate;/*
@outhor shkstart
@date 2019/12/7-11:14
*/

import java.util.function.Predicate;

public class Demo04Predicate_negate {
    public static boolean checkString(String s, Predicate<String> pre1) {

        //return !pre1.test(s);
        return pre1.negate().test(s);
    }

    public static void main(String[] args) {
        String s = "bcdefh";
        boolean b = checkString(s, (str) -> {
            return str.length() > 5;
        });
        System.out.println(b);

    }
}
