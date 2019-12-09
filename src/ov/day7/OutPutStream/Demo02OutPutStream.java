package ov.day7.OutPutStream;/*
@outhor shkstart
@date 2019/12/3-11:52
*/

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo02OutPutStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("b.txt");
        fos.write(49);
        fos.write(48);
        fos.write(48);
        byte[] bytes = {65, 66, 67, 68, 69};
        fos.write(bytes);
       // byte[] bytes1 = {-65, -66, -67, 68, 69};
       // fos.write(bytes1);
        fos.write(bytes,1,2);
        byte[] bytes2="你好".getBytes();
        System.out.println(Arrays.toString(bytes2));

        fos.write("你好".getBytes());
        fos.close();
    }
}
