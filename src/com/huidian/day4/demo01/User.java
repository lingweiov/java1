package com.huidian.day4.demo01;/*
@outhor shkstart
@date 2019/11/23-8:32
*/

public class User {
    private String name;
    private  int money;
    public void show(){
        System.out.println("我叫："+name+",我有多少钱："+money );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public User(String name, int money) {

        this.name = name;
        this.money = money;
    }

    public User() {

    }
}
