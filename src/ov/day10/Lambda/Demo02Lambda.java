package ov.day10.Lambda;/*
@outhor shkstart
@date 2019/12/6-21:44
*/

public class Demo02Lambda {
    public static void showLog(int level, MessageBuilder mb) {
        if (level == 1) {
            System.out.println(mb.MessageBuilder());
        }
    }

    public static void main(String[] args) {
        String msg1="Helo";
        String msg2="World";
        String msg3="Java";
       /* showLog(2,()->{
            return msg1+msg2+msg3;
        });*/
        showLog(1,()->{
            System.out.println("满足条件才执行");
            return msg1+msg2+msg3;
        });
    }
}
