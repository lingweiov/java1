package ov.day8.Copy;/*
@outhor shkstart
@date 2019/12/3-23:21
*/

import java.io.*;

public class Demo02CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("c:\\1.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:\\1.jpg"));
        /*int len=0;
        while ((len=bis.read())!=-1){
             //System.out.println(len);
            bos.write(len);
        }*/
        byte[] bytes = new byte[1024];
        int len=0;
        while ((len=bis.read(bytes))!=-1){
            // System.out.println(new String(bytes,0,len));
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();
        long e = System.currentTimeMillis();
        System.out.println("复制文件共耗时"+(e-s)+"毫秒");
    }
}
