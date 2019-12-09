package ov.day7.OutPutStream;/*
@outhor shkstart
@date 2019/12/3-14:56
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03OutPutStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("c.txt", true);
        for (int i = 0; i < 10; i++) {
            fos.write("你好".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}
