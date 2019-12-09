package ov.day6.File.demo01;/*
@outhor shkstart
@date 2019/12/2-10:58
*/

import java.io.File;

public class Demo04File {
    public static void main(String[] args) {
        //show01();
        show02();
    }

    private static void show02() {
        File f1 = new File("D:\\IdeaProject\\java1");
        if(f1.exists()){
            System.out.println("f1:"+f1.isDirectory());
            System.out.println("f1:"+f1.isFile());
        }
        File f2 = new File("D:\\IdeaProject\\java");
        if (f2.exists()){
            System.out.println("f2:"+f2.isFile());
            System.out.println("f2:"+f2.isDirectory());
        }
        File f3 = new File("D:\\IdeaProject\\java\\java.iml");
        if (f3.exists()){
            System.out.println("f3:"+f3.isFile());
            System.out.println("f3:"+f3.isDirectory());
        }



    }

    private static void show01() {
        File f1 = new File("D:\\IdeaProject\\java");
        System.out.println(f1.exists());
        File f2 = new File("D:\\IdeaProject\\java1");
        System.out.println(f2.exists());
        File f3 = new File("workspace.xml");
        System.out.println(f3.exists());

        File f4 = new File("java.iml");
        System.out.println(f4.exists());

        File f5 = new File("java1.iml");
        System.out.println(f5.exists());

    }
}
