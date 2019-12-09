package ov01.day1.ConstructorMethodReference;/*
@outhor shkstart
@date 2019/12/9-20:26
*/

public class Person {
    private String name;

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
