package ov.day4.demo09;/*
@outhor shkstart
@date 2019/11/29-20:41
*/

public class Person {
    private String name;
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(name+"-->"+i);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {

    }

    public Person(String name) {

        this.name = name;
    }
}
