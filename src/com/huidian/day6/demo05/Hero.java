package com.huidian.day6.demo05;/*
@outhor shkstart
@date 2019/11/26-10:43
*/

public class Hero {
   private String name;
   private int age;
    private Weapon weapon;
    public void attact(){
        System.out.println("年龄为"+age+"的"+name+"用"+weapon.getCode()+"攻击敌方");
    }

    public Hero() {
    }

    public Hero(String name, int age, Weapon weapon) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
