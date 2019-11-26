package com.huidian.day5.demo07;/*
@outhor shkstart
@date 2019/11/25-15:00
*/

public class DemoGame {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("艾希");
      //  hero.setSkill(new SkillImpl());
       // hero.attack();
      /*  Skill skill=new Skill() {
            @Override
            public void use() {
                System.out.println("pia~pia~pia~");
            }
        };
        hero.setSkill(skill);*/
      hero.setSkill(new Skill() {
          @Override
          public void use() {
              System.out.println("biu~pia~biu~pia~");
          }
      });
        hero.attack();
    }
}
