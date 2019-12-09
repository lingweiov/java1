package ov.day6.File.demo03Filter;/*
@outhor shkstart
@date 2019/12/3-9:20
*/

import java.io.File;

public class Demo01Filter {
    public static void main(String[] args) {
        File file = new File("D:\\IdeaProject");
        getAllFile(file);
    }

    public static void getAllFile(File dir) {
        File[] files = dir.listFiles(new FileFilterImpl());

        for (File file : files) {
            if (file.isDirectory()) {
                getAllFile(file);
            } else {
                System.out.println(file);
            }
        }
    }
}
