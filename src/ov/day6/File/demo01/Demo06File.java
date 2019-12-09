package ov.day6.File.demo01;/*
@outhor shkstart
@date 2019/12/2-16:17
*/

import java.io.File;


public class Demo06File {
    public static void main(String[] args) {
       // show01();
        show02();
    }

    private static void show02() {
        File file = new File("D:\\IdeaProject\\java\\javaFile");
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
        
    }

    private static void show01() {
        //File file = new File("D:\\IdeaProject\\java\\javaFile\\1.txt");
        //NullPointerException 空指针异常
       //  File file = new File("D:\\IdeaProject\\java\\jav");//NullPointerException 空指针异常
        File file = new File("D:\\IdeaProject\\java\\javaFile");
        String[] arr = file.list();
        for (String fileName : arr) {
            System.out.println(fileName);
        }

    }
}
