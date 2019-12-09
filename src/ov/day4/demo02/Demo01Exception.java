package ov.day4.demo02;/*
@outhor shkstart
@date 2019/11/29-10:20
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01Exception {
    public static void main(String[] args)/* throws ParseException */ {
       /* SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;//ParseException:解析异常
        try {
            date = sdf.parse("1987-06-03");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);*/
      /* int[] arr={1,23,223};
        System.out.println(arr[0]);
        try {
  System.out.println(arr[3]);
  //ArrayIndexOutOfBoundsException:索引越界异常

        }catch (Exception e){
            System.out.println(e);
        }*/

      /*  Long[] arr = new Long[1024 * 1024 * 1024];
//java.lang.OutOfMemoryError:内存溢出错误，必须修改代码*/

        System.out.println("后续代码");

    }
}
