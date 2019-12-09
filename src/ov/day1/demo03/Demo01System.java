package ov.day1.demo03;/*
@outhor shkstart
@date 2019/11/26-21:36
*/

import java.util.Arrays;

public class Demo01System {
    public static void main(String[] args) {
        demo011();
        demo012();

    }

    private static void demo012() {
        int[] src = {1, 2, 3, 4, 5};
        int[] dest = {6, 7, 8, 9, 10,11};
        System.out.println("复制前：" + Arrays.toString(dest));
        System.arraycopy(src, 0, dest, 0, 3);
        System.out.println("复制后："+ Arrays.toString(dest));

    }

    private static void demo011() {
        long s = System.currentTimeMillis();
        for (int i = 1; i < 9999; i++) {
            System.out.print(i);
        }
        long e = System.currentTimeMillis();
        System.out.println("程序功耗时：" + (e - s) + "毫秒");
    }
}
