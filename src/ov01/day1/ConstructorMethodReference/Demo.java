package ov01.day1.ConstructorMethodReference;/*
@outhor shkstart
@date 2019/12/9-20:29
*/

public class Demo {
    public static void printName(String name,PersonBuilder pb){
        Person person = pb.builderPerson(name);
        System.out.println(person.getName());
    }
    public static void main(String[] args) {
        /*printName("赵四",(name)->{
          return   new Person(name);
        });*/
        printName("古力娜扎",Person::new);


    }
}
