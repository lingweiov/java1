package ov.day6.File.demo03Filter;/*
@outhor shkstart
@date 2019/12/3-9:20
*/

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Demo02Filter {
    public static void main(String[] args) {
        File file = new File("D:\\IdeaProject");
        getAllFile(file);
    }

    public static void getAllFile(File dir) {
       /* File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {

               return pathname.isDirectory()||pathname.getName().endsWith("Skill.java");
            }
        });*/

      /*  File[] files = dir.listFiles((File pathname)-> {
            return pathname.isDirectory() || pathname.getName().endsWith("Skill.java");
        } );*/

        File[] files = dir.listFiles((File pathname) ->
                pathname.isDirectory() || pathname.getName().endsWith("Skill.java")
        );
      /*  File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir, name).isDirectory() || name.toLowerCase().endsWith(".java");
            }
        });*/
       /* File[] files = dir.listFiles((File d,String name)-> {

                return new File(d, name).isDirectory() || name.toLowerCase().endsWith(".java");

        });*/
        // File[] files = dir.listFiles(( d,  name)->  new File(d, name).isDirectory() || name.toLowerCase().endsWith(".java"));

        for (File file : files) {
            if (file.isDirectory()) {
                getAllFile(file);
            } else {
                System.out.println(file);
            }
        }
    }
}
