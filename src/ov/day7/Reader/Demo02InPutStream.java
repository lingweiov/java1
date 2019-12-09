package ov.day7.Reader;/*
@outhor shkstart
@date 2019/12/3-16:39
*/


import java.io.FileReader;
import java.io.IOException;

public class Demo02InPutStream {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("c.txt");
        /*int len=0;
        while ((len=fr.read())!=-1){
            System.out.print((char) len);
        }*/
        char[] cs = new char[1024];
        int len = 0;
        while ((len = fr.read(cs)) != -1) {
            System.out.println(new String(cs, 0, len));
        }
        fr.close();
    }
}
