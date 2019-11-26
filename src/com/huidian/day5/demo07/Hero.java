package com.huidian.day5.demo07;/*
@outhor shkstart
@date 2019/11/25-14:57
*/

public class Hero {
private String name;
private Skill Skill;

    public Hero() {
    }

    public Hero(String name, com.huidian.day5.demo07.Skill skill) {
        this.name = name;
        Skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public com.huidian.day5.demo07.Skill getSkill() {
        return Skill;
    }

    public void setSkill(com.huidian.day5.demo07.Skill skill) {
        Skill = skill;
    }
    public void attack(){
        System.out.println("我叫"+name+",开始施放技能");
        Skill.use();
        System.out.println("施放技能完成");
    }
}
