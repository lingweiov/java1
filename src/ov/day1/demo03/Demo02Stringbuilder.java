package ov.day1.demo03;/*
@outhor shkstart
@date 2019/11/26-22:32
*/

public class Demo02Stringbuilder {
    public static void main(String[] args) {
       // StringBuilder bu1 = new StringBuilder();
        StringBuilder bu  = new StringBuilder();
        /*StringBuilder bu2 = bu1.append("abc");
        System.out.println(bu1);
        System.out.println(bu2);
        System.out.println(bu1 == bu2);
        System.out.println(bu == bu1);*/
        bu.append("abc");
        bu.append(1);
        bu.append(true);
        bu.append(0.8);
        bu.append('中');
        System.out.println(bu);
        System.out.println("abc".toUpperCase().toLowerCase().toUpperCase().toLowerCase());
bu.append("abc").append(1).append(true).append(0.8).append('中');
        System.out.println(bu);
    }

}
