package ov.day3.demo03;/*
@outhor shkstart
@date 2019/11/28-17:37
*/

import java.util.HashMap;
import java.util.Map;

public class Demo01Map {
    public static void main(String[] args) {
       show01();
       show012();
       show013();
       show014();
    }

    private static void show014() {
        Map<String,Integer> map=new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);
        boolean b1 = map.containsKey("赵丽颖");
        System.out.println("b1="+b1);
        boolean b2 = map.containsKey("赵颖");
        System.out.println("b2="+b2);
    }

    private static void show013() {
        Map<String,Integer> map=new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);
        Integer v1 = map.get("杨颖");
        System.out.println("v1="+v1);
        Integer v2 = map.get("迪丽热巴");
        System.out.println("v2="+v2);
    }

    private static void show012() {
        Map<String,Integer> map=new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);
        System.out.println("map="+map);//无序的集合
        Integer v1 = map.remove("林志玲");
        System.out.println("v1="+v1);
        System.out.println("map="+map);
        Integer v2 = map.remove("林志玲");
        System.out.println("v2="+v2);
    }

    private static void show01() {
        Map<String,String> map=new HashMap<>();
        String v1 = map.put("str1", "张三11");
        String v3 = map.put("str2", "张三21");
        System.out.println("map.values="+map.values());
        System.out.println("v1="+v1);
        String v2 = map.put("str1", "张三12");
        System.out.println("v2="+v2);
        map.put("str3","李四");
        map.put("str4","王五");
        map.put("str5","赵六");
        System.out.println("map="+map);
        System.out.println("map.values="+map.values());
    }
}
