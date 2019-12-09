package ov01.day1.MethodReference;/*
@outhor shkstart
@date 2019/12/9-16:37
*/

public class Demo01Printable {
    public static void printString(Printable p) {
        p.print("HelloWorld");
    }

    public static void main(String[] args) {
        printString((s) -> {
            System.out.println(s);
        });
        printString(System.out::println);

    }

}
