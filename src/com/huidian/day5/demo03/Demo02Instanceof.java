package com.huidian.day5.demo03;/*
@outhor shkstart
@date 2019/11/25-9:59
*/

public class Demo02Instanceof {
    public static void main(String[] args) {
        Animal animal=new Dog();
        animal.eat();
        if(animal instanceof Dog){
          Dog dog=(Dog)animal;
          dog.watchHouse();
        }
        if (animal instanceof Cat){
            Cat cat=(Cat)animal;
            cat.catchMouse();
        }
        giveMeAPet(new Dog());
    }
    public static void giveMeAPet(Animal animal){
        if(animal instanceof Dog){
            Dog dog=(Dog)animal;
            dog.watchHouse();
        }
        if (animal instanceof Cat){
            Cat cat=(Cat)animal;
            cat.catchMouse();
        }
    }
}
