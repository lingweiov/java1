package ov01.day1.Stream;/*
@outhor shkstart
@date 2019/12/9-8:19
*/

import java.util.ArrayList;
import java.util.List;

public class Demo01List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        List<String> listA = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")){
                listA.add(s);
            }
        }
        List<String> listB = new ArrayList<>();
        for (String s : listA) {
            if (s.length()==3){
                listB.add(s);
            }
        }
        for (String s : listB) {
            System.out.println(s);
        }
    }

}
