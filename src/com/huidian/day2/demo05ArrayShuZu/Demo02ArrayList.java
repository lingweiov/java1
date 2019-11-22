package com.huidian.day2.demo05ArrayShuZu;/*
@outhor shkstart
@date 2019/11/21-17:07
*/

import java.util.ArrayList;

public class Demo02ArrayList {
    public static void main(String[] args) {
       /*创建了一个ArrayList集合，名称是list,里面装的全是string类型的数据
       从jdk1.7开始，右侧的<>内部可以不写内容，但是<>必须写
       * */
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);
        //向集合当中添加一些数据，需要用到add方法
        list.add("张三");
        list.add("李四");
        System.out.println(list);

    }

}
