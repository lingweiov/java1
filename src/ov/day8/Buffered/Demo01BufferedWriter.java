package ov.day8.Buffered;/*
@outhor shkstart
@date 2019/12/4-8:42
*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo01BufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("i.txt"));
        for (int i = 0; i < 10; i++) {
           bw.write("ov学习"+i);
          // bw.write("\r\n");
            bw.newLine();
           bw.write("ov学习java"+i);
            bw.write("\r\n");
        }
        bw.flush();
        bw.close();

    }
}
