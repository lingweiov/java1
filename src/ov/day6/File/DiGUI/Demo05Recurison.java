package ov.day6.File.DiGUI;/*
@outhor shkstart
@date 2019/12/3-8:54
*/

import java.io.File;

public class Demo05Recurison {
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
              /*  //  String name = file.getName();
                //  String path = file.getPath();
                String s = file.toString();
                s=s.toLowerCase();//不区分大小写
                // boolean b = name.endsWith(".java");
                // boolean b = path.endsWith(".java");
                boolean b = s.endsWith(".java");
                if (b) {
                    System.out.println(file);}
*/
                if (file.getName().toLowerCase().endsWith(".java")) {
                    System.out.println(file);

                }
            }
        }
    }
}
