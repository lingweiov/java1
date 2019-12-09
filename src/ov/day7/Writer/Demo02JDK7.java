package ov.day7.Writer;/*
@outhor shkstart
@date 2019/12/3-20:58
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02JDK7 {
    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        try( FileInputStream fis = new FileInputStream("c:\\1.jpg");
             FileOutputStream fos = new FileOutputStream("d:\\1.jpg");) {

            int len = 0;
            while ((len=fis.read())!=-1){
                fos.write(len);//每次读取一个字节
            }

        }catch (IOException e){
            System.out.println(e);
        }


        long e = System.currentTimeMillis();
        System.out.println("复制文件共耗时"+(e-s)+"毫秒");
    }
}
