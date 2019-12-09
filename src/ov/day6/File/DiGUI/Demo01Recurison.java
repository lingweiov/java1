package ov.day6.File.DiGUI;/*
@outhor shkstart
@date 2019/12/2-16:59
*/

public class Demo01Recurison {
    public static void main(String[] args) {
        //a();
        b(1);
    }

    public Demo01Recurison() {
       //构造方法禁止递归
       // Demo01Recurison();
    }

    private static void b(int i) {
        System.out.println(i);
        if(i==10000){return;}
       // if(i==12000){return;}
        b(++i);//递归次数数据过大时shStackOverflowError：栈内存溢出异常
    }

    private static void a() {


        System.out.println("a方法");

        a();//StackOverflowError：栈内存溢出异常
    }
}
