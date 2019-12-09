package ov.day2.demo01.Generic;/*
@outhor shkstart
@date 2019/11/27-17:40
*/

import java.util.ArrayList;
import java.util.Collection;

public class Demo06Generic {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<Integer>();
        Collection<String> list2 = new ArrayList<String>();

        Collection<Number> list3 = new ArrayList<Number>();
        Collection<Object> list4 = new ArrayList<Object>();
        getElement1(list1);
       // getElement1(list2);报错
        getElement1(list3);
        //getElement1(list4);报错
/*
* Integer extends Number extends Object
* String extends Object
* */

       // getElement2(list1);报错
       // getElement2(list2);报错
        getElement2(list3);
        getElement2(list4);
    }


    private static void getElement1(Collection<? extends Number> coll) {
//泛型的上限，此时的泛型？，必须是Number类型或是Number类型的子类
    }

    private static void getElement2(Collection<? super Number> coll) {
        //泛型的下限，此时的泛型？，必须是Number类型或是Number类型的父类
    }
}