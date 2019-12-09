package ov.day6.File.DiGUI;/*
@outhor shkstart
@date 2019/12/3-8:54
*/

import java.io.File;

public class Demo04Recurison {
    public static void main(String[] args) {
        File file = new File("D:\\IdeaProject");
        getAllFile(file);
    }

    public static void getAllFile(File dir) {

        File[] files = dir.listFiles();

        for (File file : files) {
            if (file.isDirectory()) {
                getAllFile(file);
            } else {
                System.out.println(file);
            }
        }
    }
}
