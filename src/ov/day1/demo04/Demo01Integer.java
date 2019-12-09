package ov.day1.demo04;/*
@outhor shkstart
@date 2019/11/26-22:55
*/

public class Demo01Integer {
    public static void main(String[] args) {
        Integer in1 = new Integer(1);
        System.out.println(in1);
        Integer in2 = new Integer("1");
        System.out.println(in2);
      Integer  in3= Integer.valueOf(1);
        System.out.println(in3);
        Integer  in4= Integer.valueOf("1");
       // Integer  in4= Integer.valueOf("a");//NumberFormatException数据格式化异常
        System.out.println(in4);
        System.out.println("==================");
        int a=in1.intValue();
        System.out.println(a);

    }
}
