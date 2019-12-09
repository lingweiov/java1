package ov01.day1.ArrayMethodReference;/*
@outhor shkstart
@date 2019/12/9-20:40
*/

import java.util.Arrays;

public class Demo {
    public static int[] creatArray(int length, ArrayBuilder ab) {
        return ab.builderArray(length);
    }

    public static void main(String[] args) {
        int[] array1 = creatArray(10, (len) -> {
            return new int[len];
        });
        System.out.println(array1.length);

        int[] array2 = creatArray(10, int[]::new);
        System.out.println(Arrays.toString(array2));
        System.out.println(array2.length);

    }
}
