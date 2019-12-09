package ov.day7.OutPutStream;/*
@outhor shkstart
@date 2019/12/3-10:57
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01OutPutStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("a.txt");
        //fos.write(Integer.parseInt("98"));
        fos.write(97);
        fos.close();
    }
}
