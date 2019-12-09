package ov.day4.demo01;/*
@outhor shkstart
@date 2019/11/29-9:13
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class DouDiZhu {
    public static void main(String[] args) {
//准备牌
        HashMap<Integer, String> poker = new HashMap<>();
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        int index = 0;
        poker.put(index, "大王");
        pokerIndex.add(index);
        index++;
        poker.put(index, "小王");
        pokerIndex.add(index);
        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index, color + number);
                pokerIndex.add(index);
                index++;
            }
        }
        // System.out.println(poker);
        // System.out.println(pokerIndex);
//洗牌
        Collections.shuffle(pokerIndex);
        //System.out.println(pokerIndex);
//发牌
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer in = pokerIndex.get(i);
            if(i>=51){
                dipai.add(in);
            }else if (i%3==0){
                player01.add(in);
            }else if (i%3==1){
                player02.add(in);
            }else if (i%3==2){
                player03.add(in);
            }
        }
 //排序
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
//看牌
        lookPoker("张三",poker,player01);
        lookPoker("李四",poker,player02);
        lookPoker("王五",poker,player03);
        lookPoker("底牌",poker,dipai);
    }
        public static void lookPoker(String name,HashMap<Integer,String> poker,ArrayList<Integer> List ) {
            System.out.print(name+":" );
            for (Integer key : List) {
                String value = poker.get(key);
                System.out.print(value+" ");
            }
            System.out.println();
        }         
    
}
