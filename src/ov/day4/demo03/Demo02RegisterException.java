package ov.day4.demo03;/*
@outhor shkstart
@date 2019/11/29-16:02
*/

import java.util.Scanner;

public class Demo02RegisterException {
    //使用数组保存已经注册过的用户名（数据库）
    static String[] usernames={"张三","李四","王五"};
    public static void main(String[] args) /*throws RegisterException*/ {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您要注册的用户名：");
        String username=sc.next();
        checkUsername(username);
    }
    public static void checkUsername(String username) /*throws RegisterException*/ {
        for (String name : usernames) {
          if(name.equals(username)){
              throw new RegisterException2("亲，该用户名已经注册！！");


          }
        }
        System.out.println("恭喜您，注册成功！！");
    }
}
