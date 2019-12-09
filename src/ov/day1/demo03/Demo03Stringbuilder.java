package ov.day1.demo03;/*
@outhor shkstart
@date 2019/11/26-22:32
*/

public class Demo03Stringbuilder {
    public static void main(String[] args) {
      String str="hello";
        System.out.println("str="+str);
        StringBuilder bu = new StringBuilder(str);
        bu.append("world");
        System.out.println("bu="+bu);
        String s = bu.toString();
        System.out.println(s);
    }

}
