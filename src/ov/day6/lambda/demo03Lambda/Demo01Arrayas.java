package ov.day6.lambda.demo03Lambda;/*
@outhor shkstart
@date 2019/12/2-9:23
*/

import java.util.Arrays;

public class Demo01Arrayas {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("柳岩", 38),
                new Person("迪丽热巴", 18),
                new Person("古力娜扎", 19)
        };
    /*    Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });*/
        //使用Lambda简化
        Arrays.sort(arr, (Person o1, Person o2) -> {
            return o1.getAge() - o2.getAge();
        });
        //再省略
        Arrays.sort(arr, (o1, o2) -> o1.getAge() - o2.getAge());

        for (Person p : arr) {
            System.out.println(p);
        }


    }
}
