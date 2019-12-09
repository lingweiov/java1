package ov.day1.demo04;/*
@outhor shkstart
@date 2019/11/26-23:10
*/

public class Demo03Integer {
    public static void main(String[] args) {
        int i1 = 100;
        String s1 = i1 + "";
        System.out.println(s1 + 200);
        System.out.println("=====================");
        String s2 = Integer.toString(100);
        System.out.println(s2 + 200);
        System.out.println("=====================");
        String s3 = String.valueOf(100);
        System.out.println(s3 + 200);
        System.out.println("=====================");
        int i = Integer.parseInt(s1);
        System.out.println(i-10);
      //  int a=Integer.parseInt("a");//NumberFormatException:数据格式化异常
        int a=Integer.parseInt("3");
        System.out.println(a+1);
    }
}
