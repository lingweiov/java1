package ov.day7.Writer;/*
@outhor shkstart
@date 2019/12/3-20:01
*/

import java.io.FileWriter;
import java.io.IOException;

public class Demo02CloseAndFlush {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("e.txt");
        fw.write(97);
          fw.flush();
          fw.write(98);
        fw.close();
        //fw.write(99);//错误close之后流被关闭了，不再能使用Stream closed
    }
}
