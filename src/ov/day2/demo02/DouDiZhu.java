package ov.day2.demo02;/*
@outhor shkstart
@date 2019/11/27-18:31
斗地主综合案例
1.准备牌  2.洗牌   3.发牌   4.看牌
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DouDiZhu {
    public static void main(String[] args) {
//1.准备牌
        ArrayList<String> puker = new ArrayList<>();
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        puker.add("大王");
        puker.add("小王");
        for (String number : numbers) {
            for (String color : colors) {
                //System.out.println(color + number);
                puker.add(color + number);
            }
        }
        //System.out.println(puker);
// 2.洗牌
        /*使用工具集合类Collections中的方法:
           static void shuffle(List<?> list)
           使用默认随机源对指定列表进行置换
           每次顺序都不一样
          */
        Collections.shuffle(puker);
       // System.out.println(puker);
//3.发牌
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for (int i = 0; i < puker.size(); i++) {
            String p = puker.get(i);
            if(i>=51){
                dipai.add(p);
            }else if (i%3==0){
                player01.add(p);
            }else if (i%3==1){
                player02.add(p);
            }else if (i%3==2){
                player03.add(p);
            }
        }
//排序
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
//5.看牌
        System.out.println("张三:"+player01);
        System.out.println("李四:"+player02);
        System.out.println("王五:"+player03);
        System.out.println("底牌:"+ dipai);

    }
}
