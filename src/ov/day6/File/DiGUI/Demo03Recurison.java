package ov.day6.File.DiGUI;/*
@outhor shkstart
@date 2019/12/3-8:47
*/

public class Demo03Recurison {
    public static void main(String[] args) {
        int jc = jc(5);
        System.out.println(jc);
    }

    public static int jc(int n) {
        if (n == 1) {
            return 1;
        }
        return n * jc(n - 1);
    }
}
