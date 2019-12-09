package ov.day6.File.demo01;/*
@outhor shkstart
@date 2019/12/2-10:08
C:\Java=
C:"+File.separator+"Java  不分系统
*/

import java.io.File;

public class Demo01File {
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);
        String separator = File.separator;
        System.out.println(separator);

    }
}
