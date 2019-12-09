package ov.day3.demo04;/*
@outhor shkstart
@date 2019/11/28-22:09
Hashtable 是一个线程安全的集合即为单线程，速度慢，不可以存储null值null键
HashMap 是一个线程不安全的集合即为多线程，速度快，可以存储null值null键
Hashtable和Vector集合一样，已经被HashMap和ArrayList分别取代，多线程，速度快
Hashtable的子类 Properties 仍然被活跃使用
Properties 集合是一个唯一和IO流相结合的集合
*/

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;

public class demo02Hashtable {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put(null,"a");
        map.put("b",null);
        map.put(null,null);
        System.out.println(map);
        Hashtable<String,String> table=new Hashtable<>();
       // table.put(null,"a");//NullPointerException:空指针异常
        //table.put("b",null);//NullPointerException:空指针异常
       // table.put(null,null);//NullPointerException:空指针异常
    }
}
