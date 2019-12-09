package ov.day8.BuffereOutputStream;/*
@outhor shkstart
@date 2019/12/4-16:03
*/

import java.io.*;

public class Demo04Test {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("我是GBK格式的文本.txt"), "gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("我是utf-8格式的文本.txt"), "utf-8");
        int len = 0;
        while ((len = isr.read()) != -1) {
            osw.write(len);
        }
        osw.close();
        isr.close();
    }
}
