package ov.day8.PrintStream;/*
@outhor shkstart
@date 2019/12/4-18:04
*/

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo02PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("我是默认的控制台中输出");
        PrintStream ps = new PrintStream("目的地打印流。txt");
        System.setOut(ps);
        System.out.println("我在打印流的目的地中输出");
        ps.close();
    }
}
