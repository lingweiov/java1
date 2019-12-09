package ov.day2.demo01.Generic;/*
@outhor shkstart
@date 2019/11/27-15:27
*/

import java.util.ArrayList;
import java.util.Iterator;

public class Generic {
    public static void main(String[] args) {
        show01();
        show02();
    }

    private static void show02() {
        ArrayList<String> list=new ArrayList<>();
        list.add("abc");
       // list.add(1);
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s+"->"+s.length());
        }
    }

    private static void show01() {
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);

            /*String s = (String) obj;
            System.out.println(s.length());
            //ClassCastException:
            // java.lang.Integer cannot be cast to java.lang.String
            //字符转换异常*/
        }
    }
}
