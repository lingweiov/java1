package ov.day10.Supplier;/*
@outhor shkstart
@date 2019/12/7-8:33
*/

import java.util.function.Supplier;

public class Demo02Test {
    public static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        int[] arr = {100, 23, 45, 67, 98, 102};
        int maxvalue = getMax(() -> {
            int max = arr[0];
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });
        System.out.println("数组中的元素最大的是："+maxvalue);
    }
}
