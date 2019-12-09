package ov.day5.demo05;/*
@outhor shkstart
@date 2019/11/30-16:01
*/

public class Demo {
    public static void main(String[] args) {
        BaoZi bz=new BaoZi();
        new BaoZiPu(bz).start();
        new ChiHuo(bz).start();
    }
}
