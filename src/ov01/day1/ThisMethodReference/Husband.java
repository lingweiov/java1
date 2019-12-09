package ov01.day1.ThisMethodReference;/*
@outhor shkstart
@date 2019/12/9-20:16
*/

public class Husband {
    public void buyHouse(){
        System.out.println("买房子1");
    }
    public void marry(Richable r){
        r.buy();
    }
    public void soHappay(){
       /* marry(()->{
            this.buyHouse();
        });*/
       marry(this::buyHouse);
    }

    public static void main(String[] args) {
        new Husband().soHappay();
    }
}
