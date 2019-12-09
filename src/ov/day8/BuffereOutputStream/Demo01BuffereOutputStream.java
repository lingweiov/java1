package ov.day8.BuffereOutputStream;/*
@outhor shkstart
@date 2019/12/3-22:55
*/

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01BuffereOutputStream {
    public static void main(String[] args) throws IOException {
        show01();
    }

    private static void show01() throws IOException {
        FileOutputStream fos = new FileOutputStream("h.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("我把数据写入到内部缓冲区中".getBytes());
        bos.flush();
        bos.close();
    }
}
