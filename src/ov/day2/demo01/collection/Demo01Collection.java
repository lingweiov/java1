package ov.day2.demo01.collection;/*
@outhor shkstart
@date 2019/11/27-8:53
collection的方法是所有集合共性的方法，都可以使用
*/

import java.util.ArrayList;
import java.util.Collection;

public class Demo01Collection {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
       // Collection<String> coll = new HashSet<>();/*[] true  [张三]  [李四, 张三, 王五, 赵六, 田七]=== true false [张三, 王五, 田七]=== false  false==  false==  3== 张三  王五  田七  [Ljava.lang.Object;@1b6d3586==  []   false   true*/
        System.out.println(coll);//重写了tostring方法 【】
        boolean b1 = coll.add("张三");
        System.out.println(b1);//true
        System.out.println(coll);
        coll.add("李四");
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        coll.add("田七");
        System.out.println(coll);
        System.out.println("=============================");
        boolean b2 = coll.remove("赵六");
        System.out.println(b2);//true
        boolean b3 = coll.remove("赵四");
        System.out.println(b3);//false
        coll.remove("李四");//一次删除一个元素
        System.out.println(coll);
        System.out.println("=============================");
        boolean b4 = coll.contains("李四");//判断是否存在
        System.out.println(b4);
        boolean b5 = coll.contains("赵四");//判断是否存在
        System.out.println(b5);
        System.out.println("=============================");
        boolean b6 = coll.isEmpty();//判断是否为空
        System.out.println(b6);
        System.out.println("========================");
        int b7 = coll.size();
        System.out.println(b7);
        System.out.println("======================");
        //集合变数组
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }
        System.out.println(arr);//没有重写tostring方法
        System.out.println("===================");
        //清空集合所有元素，还存在一个空集合
        coll.clear();
        System.out.println(coll);
        System.out.println(b6);
        System.out.println(coll.isEmpty());
    }
}
