package ov.day6.File.demo01;/*
@outhor shkstart
@date 2019/12/2-12:01
*/

import java.io.File;
import java.io.IOException;

public class Demo05File {
    public static void main(String[] args) throws IOException {
        // show01();
       //  show02();
         show03();
    }

    private static void show03() {
        File f1 = new File("javaFile\\新建文件夹");//新建文件夹.txt
        boolean b1 = f1.delete();
        System.out.println("b1="+b1);
        File f2 = new File("javaFile\\aaa.txt");
        boolean b2 = f2.delete();
        System.out.println(b2);
        File f3 = new File("ja");
        boolean b3 = f3.delete();
        System.out.println(b3);

    }

    private static void show02() {
        //创建文件夹
        File f1 = new File("javaFile\\aaa");
        boolean b1 = f1.mkdir();
        System.out.println("b1:"+b1);
        File f2 = new File("javaFile\\111\\222\\13");
        boolean b2 = f2.mkdir();//只能创建单级文件夹
        System.out.println("b2:"+b2);
        boolean b3 = f2.mkdirs();//创建多级文件夹
        System.out.println("b3:"+b3);
        File f4 = new File("javaFile\\aaa.txt");
        boolean b4 = f4.mkdirs();// 创建 文件夹,不能创建文件
        System.out.println("b4:"+b4);
        File f5 = new File("ja\\ccc");
        boolean b5 = f5.mkdirs();//
        System.out.println("b5:"+b5);

    }

    private static void show01() throws IOException {
        //创建文件
        File f1 = new File("D:\\IdeaProject\\java\\javaFile\\1.txt");
        boolean b1  = f1.createNewFile();
        System.out.println("b1:"+b1);
        File f2 = new File("javaFile\\2.txt");
        boolean b2  = f2.createNewFile();
        System.out.println("b2:"+b2);

        File f3 = new File("javaFile\\新建文件夹");//新建文件夹.txt
        System.out.println(f3.createNewFile());

       /* File f4 = new File("java\\新建文件夹");系统找不到指定的路径。
        System.out.println(f4.createNewFile());*/


    }
}
