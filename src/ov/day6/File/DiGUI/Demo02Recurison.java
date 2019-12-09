package ov.day6.File.DiGUI;/*
@outhor shkstart
@date 2019/12/2-17:26
*/

public class Demo02Recurison {
    public static void main(String[] args) {
        int s = sum(3);
        System.out.println(s);
    }

    private static int  sum(int n) {
        if (n==1){
           return 1;
        }
        return n+sum(n-1);
    }
}
