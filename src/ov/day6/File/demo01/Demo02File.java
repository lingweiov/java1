package ov.day6.File.demo01;/*
@outhor shkstart
@date 2019/12/2-10:16
*/

import java.io.File;

public class Demo02File {
    public static void main(String[] args) {
       // show01();
       // show02("c:\\","a.txt");
       // show02("d:\\","a.txt");
        show03();
    }

    private static void show03() {
        File parent = new File("c:\\");
        File file = new File(parent, "hello.java");
        System.out.println(file);
    }

    private static void show02(String parent,String child) {
        File file = new File(parent, child);
        System.out.println(file);
    }

    private static void show01() {
        File f1 = new File("D:\\IdeaSouse\\我的图片资源\\a.txt");
        System.out.println(f1);
        File f2 = new File("D:\\IdeaSouse\\我的图片资源");
        System.out.println(f2);
        File f3 = new File("a.txt");
        System.out.println(f3);
    }
}
