package ov01.day1.SupperMethodReference;/*
@outhor shkstart
@date 2019/12/9-20:04
*/

public class Man extends Human {
    @Override
    public void sayHello() {
        System.out.println("Hello 我是Man");
    }
    public void method(Greetable g){
        g.greet();
    }
    public void show(){
       /* method(()->{
            Human h = new Human();
            h.sayHello();
        });*/
      /* method(()->{
          super.sayHello();
       });*/
       /* Runnable sayHello = super::sayHello;
        System.out.println(sayHello);*/
       method(super::sayHello);
    }

    public static void main(String[] args) {
        new Man().show();
    }
}
