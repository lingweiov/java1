package ov01.day1.Stream;/*
@outhor shkstart
@date 2019/12/9-11:39
*/

import java.util.ArrayList;

public class Demo01StreamTest {
    public static void main(String[] args) {
        ArrayList<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("石破天");
        one.add("石中玉");
        one.add("老子");
        one.add("庄子");
        one.add("洪七公");
        ArrayList<String> one1 = new ArrayList<>();

        for (String name : one) {
            if (name.length() == 3) {
                one1.add(name);
            }
        }
        ArrayList<String> one2 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            one2.add(one1.get(i));
        }


        ArrayList<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("赵丽颖");
        two.add("张三丰");
        two.add("尼古拉斯赵四");
        two.add("张天爱");
        two.add("张二狗");
        ArrayList<String> two1 = new ArrayList<>();
        for (String name : two) {
            if (name.startsWith("张")) {
                two1.add(name);
            }
        }

        ArrayList<String> two2 = new ArrayList<>();

        for (int i = 2; i < two1.size(); i++) {
            two2.add(two1.get(i));
        }


        ArrayList<String> all = new ArrayList<>();
        all.addAll(one2);
        all.addAll(two2);

        ArrayList<Person> list = new ArrayList<>();
        for (String name : all) {
            list.add(new Person(name));
          //  list.add(name);
        }
        for (Person person : list) {
            System.out.println(person);
        }

    }
}
