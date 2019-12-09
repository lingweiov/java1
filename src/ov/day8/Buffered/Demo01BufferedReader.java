package ov.day8.Buffered;/*
@outhor shkstart
@date 2019/12/4-10:00
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo01BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("i.txt"));
        /*String line = br.readLine();
        System.out.println(line);
        line = br.readLine();
        System.out.println(line);
        line = br.readLine();
        System.out.println(line);
        line = br.readLine();
        System.out.println(line);*/
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();


    }
}
