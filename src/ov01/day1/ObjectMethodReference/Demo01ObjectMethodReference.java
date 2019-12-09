package ov01.day1.ObjectMethodReference;/*
@outhor shkstart
@date 2019/12/9-16:54
*/

import ov01.day1.MethodReference.Printable;

public class Demo01ObjectMethodReference {
    public static void printString(Printable p) {
        p.print("Hello");
    }

    public static void main(String[] args) {
        printString((s)->{
            MethodRerObject obj = new MethodRerObject();
            obj.printUpperCaseString(s);
        });

        MethodRerObject obj = new MethodRerObject();
        printString(obj::printUpperCaseString);
    }
}
