package ov.day4.demo02;/*
@outhor shkstart
@date 2019/11/29-10:35
*/

public class Demo02Exception {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int e = getElement(arr, 0);
        System.out.println(e);
    }
    public static int getElement(int[] arr, int index) {
         int ele=arr[index];
         return ele;
    }
}
