package ov.day8.ObjectStream;/*
@outhor shkstart
@date 2019/12/4-16:38
*/

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo01ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"));
        oos.writeObject(new Person("小美女", 18));
        //NotSerializableException；没有序列化异常
        oos.close();


    }
}
