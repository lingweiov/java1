package ov.day3.demo03;/*
@outhor shkstart
@date 2019/11/28-20:14
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo02KeySet {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        Map<String,Integer> map=new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String key = it.next();
            Integer value = map.get(key);
            System.out.println("key="+key);
            System.out.println("value="+value);
            System.out.println("============");
        }
        System.out.println("------------------------------");
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println("key="+key);
            System.out.println("value="+value);
            System.out.println("============");
        }

    }
}
