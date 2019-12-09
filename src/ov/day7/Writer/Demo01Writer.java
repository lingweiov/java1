package ov.day7.Writer;/*
@outhor shkstart
@date 2019/12/3-19:32
*/

import java.io.FileWriter;
import java.io.IOException;

public class Demo01Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("d.txt");
        fw.write(97);
      //  fw.flush();
        fw.close();

    }
}
