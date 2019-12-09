package ov.day8.File;/*
@outhor shkstart
@date 2019/12/4-11:47
*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo01FileWriter {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("我是GBK格式的文本.txt");
        int len=0;
        while ((len=fr.read())!=-1){
            System.out.print((char) len);
        }
        fr.close();
    }
}
