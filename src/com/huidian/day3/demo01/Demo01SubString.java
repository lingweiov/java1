package com.huidian.day3.demo01;

/*字符窜的截取方法
 * */
public class Demo01SubString {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str1);//HelloWorld
        System.out.println(str2);//World
        System.out.println("===============");
        String str3 = str1.substring(4, 7);
        System.out.println(str3);//oWo
    }
}
