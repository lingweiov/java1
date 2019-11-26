package com.huidian.day6.demo05;/*
@outhor shkstart
@date 2019/11/26-10:47
*/



public class DemoMain {
    public static void main(String[] args) {
      Hero hero=new Hero();
      hero.setName("张三");
      hero.setAge(16);
      Weapon weapon=new Weapon("大宝剑");
   // Weapon  hero.setWeapon("大宝剑");
        hero.setWeapon(weapon);
        hero.attact();
    }
}
