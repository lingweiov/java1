package ov.day3.demo04;/*
@outhor shkstart
@date 2019/11/28-21:19
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo01HashMapSavePerson {
    public static void main(String[] args) {
        show01();
        System.out.println("==========");
        show02();
    }

    private static void show02() {
        HashMap<Person,String> map=new HashMap<>();
        map.put(new Person("女王",18),"英国");
        map.put(new Person("秦始皇",20),"秦国");
        map.put(new Person("普京",30),"俄罗斯");
        map.put(new Person("女王",18),"毛里求斯");
        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person, String> entry : set) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"-->"+value);
        }
    }

    private static void show01() {
        HashMap<String,Person> map=new HashMap<>();
        map.put("北京",new Person("张三",18));
        map.put("上海",new Person("李四",19));
        map.put("广州",new Person("王五",20));
        map.put("北京",new Person("赵六",18));
        Set<String> set = map.keySet();
        for (String key : set) {
            Person value = map.get(key);
            System.out.println(key+"-->"+value);
        }
    }
}
