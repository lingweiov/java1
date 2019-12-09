package ov.day7.Writer;/*
@outhor shkstart
@date 2019/12/3-20:41
*/

import java.io.FileWriter;
import java.io.IOException;

public class Demo04Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("g.txt",true);
        for (int i = 0; i <10; i++) {
            fw.write("HelloWorld"+i+"\r\n");
        }
        fw.close();
    }
}
