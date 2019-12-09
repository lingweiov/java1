package ov.day10.Lambda;/*
@outhor shkstart
@date 2019/12/6-21:38
*/

public class Demo01Logger {
    public static void showLog(int level, String message) {
        if (level == 1) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        String msg1="Helo";
        String msg2="World";
        String msg3="Java";

        showLog(1,msg1+msg2+msg3);
    }
}
