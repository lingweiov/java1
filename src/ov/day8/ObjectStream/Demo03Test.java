package ov.day8.ObjectStream;/*
@outhor shkstart
@date 2019/12/4-17:27
*/

import java.io.*;
import java.util.ArrayList;

public class Demo03Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三", 18));
        list.add(new Person("李四", 19));
        list.add(new Person("王五", 20));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("list.txt"));
        oos.writeObject(list);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("list.txt"));
        Object o = ois.readObject();
        System.out.println(o);
        ArrayList<Person> list2 = (ArrayList<Person>) o;
        for (Person p : list2) {
            System.out.println(p);
            System.out.println(p.toString());
            System.out.println(p.getAge());
            System.out.println(p.getName());

        }
        ois.close();
        oos.close();


    }
}
