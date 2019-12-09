package ov.day8.ObjectStream;/*
@outhor shkstart
@date 2019/12/4-16:49
ClassNotFoundException:文件找不到异常
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo02ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"));
        Object o = ois.readObject();
        ois.close();
        System.out.println(o);
        System.out.println(o.getClass());
        System.out.println(o.getClass().getName());
        Person p = (Person) o;
        System.out.println(p);
        System.out.println(p.getName()+p.getAge()+p.toString());

    }
}
