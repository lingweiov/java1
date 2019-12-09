package ov.day6.File.demo01;/*
@outhor shkstart
@date 2019/12/2-10:35
*/

import java.io.File;

public class Demo03File {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
        show04();
    }

    private static void show04() {
        File f1 = new File("D:\\IdeaSouse\\我的图片资源\\1.jpg");
        long l1 = f1.length();
        System.out.println(l1);
        File f2 = new File("D:\\IdeaSouse\\我的图片资源\\18.jpg");
        long l2 = f2.length();
        System.out.println(l2);
        File f3 = new File("D:\\IdeaSouse\\我的图片资源");
        System.out.println(f3.length());

    }

    private static void show03() {
        File f1 = new File("D:\\IdeaProject\\java\\a.txt");
        String name1 = f1.getName();
        System.out.println(name1);
        File f2 = new File("D:\\IdeaProject\\java");
        String name2 = f2.getName();
        System.out.println(name2);

    }

    private static void show02() {
        File f1 = new File("D:\\IdeaProject\\java\\a.txt");
        File f2 = new File("b.txt");
        String path1 = f1.getPath();
        System.out.println(path1);
        String path2 = f2.getPath();
        System.out.println(path2);

        System.out.println(f1);
        System.out.println(f1.toString());

        System.out.println(f2.toString());
        System.out.println(f2);

    }

    private static void show01() {
        File f1 = new File("D:\\IdeaProject\\java\\a.txt");
        String absolutePath1 = f1.getAbsolutePath();
        System.out.println(absolutePath1);
        File f2 = new File("b.txt");
        String absolutePath2 = f2.getAbsolutePath();
        System.out.println(absolutePath2);
    }
}
