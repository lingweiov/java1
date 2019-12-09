package ov.day7.Writer;/*
@outhor shkstart
@date 2019/12/3-19:32
*/

import java.io.FileWriter;
import java.io.IOException;

public class Demo03Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("f.txt");
        char[] cs={'a','b','c','d','e'};
        fw.write(cs);
        fw.write(cs,1,3);
        fw.write("ov学习");
        fw.write("ov的java学习",3,4);
      //  fw.flush();
        fw.close();

    }
}
