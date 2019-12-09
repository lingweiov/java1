package ov.day2.demo01.Generic;/*
@outhor shkstart
@date 2019/11/27-16:58
*/

public class GenericMethod {
    public <M> void method01(M m){
        System.out.println(m);
    }
    public static <S> void method02(S s) {
        System.out.println(s);
    }
}
