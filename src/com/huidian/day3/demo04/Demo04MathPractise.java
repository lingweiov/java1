package com.huidian.day3.demo04;/*
@outhor shkstart
@date 2019/11/22-16:48
数学练习
题目
计算-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个
分析：
1.一定范围，for循环
2.起点位置-10.8应该转换为-10，两种办法
  2,1可以使用Math.ceil，向上（向正方向)取整
  2.2 强转为int，自动舍弃所有小数位
3.每一个数字都是整数，所以不仅表达式应该是num++，这样每次+1
4.那绝对值方法：math.abs
5.一旦发现了一个数字，需要让计数器++进行统计
*/

public class Demo04MathPractise {
    public static void main(String[] args) {
        int count = 0;
        double min = -10.8;
        double max = 5.9;
        for (int i = (int) min; i < max; i++) {
            int abs = Math.abs(i);
            if (abs > 6 || abs < 2.1) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("总共有："+count+"个");
    }
}
