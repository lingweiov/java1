package ov.day10.Predicate;/*
@outhor shkstart
@date 2019/12/7-9:39
*/

import java.util.function.Predicate;

public class Demo01Predicate_test {
    public static boolean checkString(String s, Predicate<String> pre) {
        return pre.test(s);
    }

    public static void main(String[] args) {
        String s = "abcde ";
      /*  boolean b=checkString(s,(String str)->{
            return str.length()>5;
        });*/
        boolean b = checkString(s, str -> str.length() > 5);
        System.out.println(b);
    }

}
