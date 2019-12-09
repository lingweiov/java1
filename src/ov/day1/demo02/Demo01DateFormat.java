package ov.day1.demo02;/*
@outhor shkstart
@date 2019/11/26-17:01
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01DateFormat {
    public static void main(String[] args) throws ParseException {
        demo011();
        demo012();
    }

    private static void demo012() throws ParseException {
        SimpleDateFormat sdf=
                new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
    Date date=sdf.parse("2019年11月26日 17时11分17秒");
        System.out.println(date);
    }

    private static void demo011() {
        SimpleDateFormat sdf=
      new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date=new Date();
        String d=sdf.format(date);
        System.out.println(date);
        System.out.println(d);
    }
}
