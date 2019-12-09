package ov.day3.demo02;/*
@outhor shkstart
@date 2019/11/28-16:42
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo03Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(3);
        list01.add(2);
        System.out.println(list01);
        Collections.sort(list01, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //return o1-o2;//升序
                return o2 - o1;//降序
            }
        });
        System.out.println(list01);
        ArrayList<Student> list02 = new ArrayList<>();
        list02.add(new Student("张三", 17));
        list02.add(new Student("b张三", 18));
        list02.add(new Student("古力娜扎", 20));
        list02.add(new Student("a迪丽热巴", 18));
        System.out.println(list02);
       /* Collections.sort(list02, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //return o1.getAge() - o2.getAge();//按年龄升序排列
                return o2.getAge() - o1.getAge();//按年龄降序排列
            }
        });*/
        Collections.sort(list02, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge() - o2.getAge();//按年龄升序排列
                // return o2.getAge() - o1.getAge();//按年龄降序排列
                if (result == 0) {
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(list02);
    }
}
