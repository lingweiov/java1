package ov.day2.demo01.Iterator;/*
@outhor shkstart
@date 2019/11/27-10:46
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo01Iterator {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        Iterator<String> it = coll.iterator();
        while (it.hasNext()) {
            String e = it.next();
            System.out.println(e);
        }
        System.out.println("=======================");
        for (Iterator<String> it2 = coll.iterator(); it2.hasNext(); ) {
            String e = it2.next();
            System.out.println(e);
        }
       /* boolean b = it.hasNext();
        System.out.println(b);
        String s = it.next();
        System.out.println(s);

        b = it.hasNext();
        System.out.println(b);
        s = it.next();
        System.out.println(s);

        b = it.hasNext();
        System.out.println(b);
        s = it.next();
        System.out.println(s);

        b = it.hasNext();
        System.out.println(b);
        s = it.next();
        System.out.println(s);

        b = it.hasNext();
        System.out.println(b);
        *//*s = it.next();//没有元素的情况下取不出来，
        // 会抛出异常：NoSuchElementException：没有元素异常
        System.out.println(s);*/

    }

}
