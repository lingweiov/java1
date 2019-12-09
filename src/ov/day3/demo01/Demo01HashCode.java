package ov.day3.demo01;/*
@outhor shkstart
@date 2019/11/28-14:22
*/

public class Demo01HashCode {
    public static void main(String[] args) {
        Person p1=new Person();
        int h1 = p1.hashCode();
        System.out.println(h1);
        Person p2=new Person();
        int h2 = p2.hashCode();
        System.out.println(h2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1 == p2);

        String s1=new String("abc");
        String s2=new String("abc");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());

    }
}
