package ov.day8.prop;/*
@outhor shkstart
@date 2019/12/3-21:22
*/

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class Demo01Properties {
    public static void main(String[] args) throws IOException {
        // show01();
        // show02();
        show03();

    }

    private static void show03() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("prop.txt"));
       // prop.load(new FileInputStream("prop.txt"));//不能读取带有中文的文件
        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key+"="+value);
        }

    }

    private static void show02() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("赵丽颖", "168");
        prop.setProperty("迪丽热巴", "165");
        prop.setProperty("古力娜扎", "163");
       /* FileWriter fw = new FileWriter("prop.txt");
        prop.store(fw,"save data");
        fw.close();//字符流可以写中文*/
        prop.store(new FileOutputStream("prop2.txt"), "baocunshuju,zhusi,buneng,yong,hanyu");
//字节流不可以写中文
    }

    private static void show01() {
        Properties prop = new Properties();
        prop.setProperty("赵丽颖", "168");
        prop.setProperty("迪丽热巴", "165");
        prop.setProperty("古力娜扎", "163");
        //prop.put(1,true);
        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key + "=" + value);
        }
    }
}
