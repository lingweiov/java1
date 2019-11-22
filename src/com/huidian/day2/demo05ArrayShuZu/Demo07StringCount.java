package com.huidian.day2.demo05ArrayShuZu;/*
@outhor shkstart
@date 2019/11/21-21:18
*/

import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Demo07StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String input = sc.next();
         int countUpper=0;
         int countLower=0;
         int countNumber=0;
         int countOther=0;

  char[] chars=input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch=chars[i];
            if('A'<=ch && ch<='Z'){
                countUpper++;
            }else if('a'<=ch&&ch<='z'){
                countLower++;
            }else if('0'<=ch&&ch<='9'){
                countNumber++;
            }else{
                countOther++;
            }
        }
        System.out.println("大写字母的个数为："+countUpper);
        System.out.println("小写字母的个数为："+countLower);
        System.out.println("数字的个数为："+countNumber);
        System.out.println("其他的个数为："+countOther);
    }

}
