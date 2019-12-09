package ov.day1.demo01;/*
@outhor shkstart
@date 2019/11/26-11:32
*/

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

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

   /* @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }*/

   /* @Override
    public boolean equals(Object obj) {
        if(obj==this){
            return true;
        }
        if(obj==null){
            return false;
        }
        if (obj instanceof Person) {
            Person p = (Person) obj;
            boolean b = this.name.equals(p.name) && this.age == p.age;
            return b;
        }

        return false;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }
}
