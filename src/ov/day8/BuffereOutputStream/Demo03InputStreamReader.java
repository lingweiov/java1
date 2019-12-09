package ov.day8.BuffereOutputStream;/*
@outhor shkstart
@date 2019/12/4-15:51
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo03InputStreamReader {
    public static void main(String[] args) throws IOException {
        //read_utf_8();
        read_gbk();
    }

    private static void read_gbk() throws IOException {
        //InputStreamReader isr = new InputStreamReader(new FileInputStream("utf_8.txt"), "utf-8");//乱码
        InputStreamReader isr = new InputStreamReader(new FileInputStream("gbk.txt"), "gbk");
        int len = 0;
        while ((len = isr.read()) != -1) {
            System.out.print((char) len);
        }
        isr.close();
    }

    private static void read_utf_8() throws IOException {
        //InputStreamReader isr = new InputStreamReader(new FileInputStream("utf_8.txt"), "utf-8");
        InputStreamReader isr = new InputStreamReader(new FileInputStream("utf_8.txt"));//默认格式为utf-8
        int len = 0;
        while ((len = isr.read()) != -1) {
            System.out.print((char) len);
        }
        isr.close();
    }
}
