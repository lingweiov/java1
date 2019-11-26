package com.huidian.day6.demo02;/*
@outhor shkstart
@date 2019/11/26-9:12
*/

public class Body {
    public class Heart{
        public void beat(){
            System.out.println("心脏跳动");
            System.out.println("我叫"+Body.this.name);
        }
    }
    private String name="李四";
    public void method(){
        System.out.println("外部类的方法");
        Heart heart=new Heart();
        heart.beat();

    }

    public Body() {
    }

    public Body(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
