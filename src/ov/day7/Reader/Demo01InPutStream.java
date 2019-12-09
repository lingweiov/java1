package ov.day7.Reader;/*
@outhor shkstart
@date 2019/12/3-16:39
*/

import java.io.FileInputStream;

import java.io.IOException;

public class Demo01InPutStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("c.txt");
        int len=0;
        while ((len=fis.read())!=-1){
            System.out.print((char) len);
        }
        fis.close();
    }
}
