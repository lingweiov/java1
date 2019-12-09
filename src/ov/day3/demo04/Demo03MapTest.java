package ov.day3.demo04;/*
@outhor shkstart
@date 2019/11/28-22:28
*/

import java.util.Hashtable;
import java.util.Scanner;

public class Demo03MapTest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("输入字符串：");
        String str = sc.next();
        Hashtable<Character,Integer>  map=new Hashtable<>();
        for (char c : str.toCharArray()) {
            if(map.containsKey(c)){
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }else{
                map.put(c,1);
            }
        }
        for (Character key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }
    }
}
