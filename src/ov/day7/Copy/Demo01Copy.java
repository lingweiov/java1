package ov.day7.Copy;/*
@outhor shkstart
@date 2019/12/3-16:10
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01Copy {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("c:\\1.jpg");
        FileOutputStream fos = new FileOutputStream("d:\\1.jpg");
       /* int len = 0;
        while ((len=fis.read())!=-1){
            fos.write(len);//每次读取一个字节
        }*/
///每次读取多个字节
        byte[] bytes = new byte[1024];
        int len=0;
        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        System.out.println("复制文件共耗时"+(e-s)+"毫秒");
    }
}
