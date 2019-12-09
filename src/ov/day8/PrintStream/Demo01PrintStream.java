package ov.day8.PrintStream;/*
@outhor shkstart
@date 2019/12/4-17:52
*/

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo01PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        //System.out.println();
        PrintStream ps = new PrintStream("print.txt");
        ps.write(97);
        ps.println(97);
        ps.println(9.7);
        ps.println('a');
        ps.println(true);
        ps.println("HelloWorld");
        ps.close();
    }
}
