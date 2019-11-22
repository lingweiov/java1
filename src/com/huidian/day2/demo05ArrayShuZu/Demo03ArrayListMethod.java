package com.huidian.day2.demo05ArrayShuZu;/*
@outhor shkstart
@date 2019/11/21-17:25
ArrayList当中常用的方法

add  public boolean add(E e):向集合当中添加元素，参数的类型和泛型一致
备注：对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可用可不用，
但是对于其他集合（今后学）来说，add添加不一定成功
public E get(int index) 从集合当中获取元素，参数是索引编号，返回值是对应位置的元素
public E remove(int index) 从集合当中删除元素，参数是索引编号，返回值是被删除的元素
    public int size() 获取集合的长度，返回值是集合中的元素的个数

*/


import java.util.ArrayList;

public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        boolean success = list.add("柳岩");
        System.out.println(list);
        System.out.println("添加的动作是否成功" + success);
        list.add("高圆圆");
        list.add("赵又廷");
        list.add("李小璐");
        list.add("贾乃亮");
        System.out.println(list);
        String name = list.get(2);
        System.out.println("索引2的元素： " + name);
        String whoremove = list.remove(3);
        System.out.println(whoremove + " 被删除");
        System.out.println(list);
        int size=list.size();
        System.out.println("集合的长度："+size);
    }
}
