package ov.day4.demo02;/*
@outhor shkstart
@date 2019/11/29-10:59
*/

import java.util.Objects;

public class Demo04Objects {
    public static void main(String[] args) {
        mehod(null);
    }

    public static void mehod(Object obj) {
        /*if (obj == null) {
            throw new NullPointerException("传递的参数为null");
        }*/
        //Objects.requireNonNull(obj);
        Objects.requireNonNull(obj,"传递的参数为null");
    }
}
