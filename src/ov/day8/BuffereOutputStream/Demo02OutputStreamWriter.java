package ov.day8.BuffereOutputStream;/*
@outhor shkstart
@date 2019/12/4-15:26
*/

import java.io.*;

public class Demo02OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        //writer_utf_8();
        writer_gbk();
    }

    private static void writer_gbk() throws IOException {
         OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk.txt"), "gbk");
        osw.write("你好");
        osw.flush();
        osw.close();
    }

    private static void writer_utf_8() throws IOException {
       // OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("utf_8.txt"), "utf-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("utf_8.txt"));//默认格式为utf-8
        osw.write("你好");
        osw.flush();
        osw.close();
    }
}
