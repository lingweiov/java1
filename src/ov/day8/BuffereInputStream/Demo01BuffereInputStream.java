package ov.day8.BuffereInputStream;/*
@outhor shkstart
@date 2019/12/3-23:08
*/

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo01BuffereInputStream {
    public static void main(String[] args) throws IOException {
        show01();
    }

    private static void show01() throws IOException {
        FileInputStream fis = new FileInputStream("h.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
       /* int len=0;
        while ((len=bis.read())!=-1){
            System.out.println(len);
        }*/
        byte[] bytes = new byte[0124];
        int len=0;
        while ((len=bis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }

        bis.close();


    }
}
