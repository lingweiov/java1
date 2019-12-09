package ov.day7.InPutStream;/*
@outhor shkstart
@date 2019/12/3-15:24
*/

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo01InPutStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
        /*int len = fis.read();
        System.out.println(len);
          len = fis.read();
        System.out.println(len);
        len = fis.read();
        System.out.println(len);
        len = fis.read();
        System.out.println(len);
        len = fis.read();
        System.out.println(len);*/
        int len=0;
        while ((len = fis.read())!=-1){
            System.out.print((char) len);
        }
        fis.close();
    }
}
