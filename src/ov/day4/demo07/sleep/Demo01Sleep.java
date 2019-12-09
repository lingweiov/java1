package ov.day4.demo07.sleep;/*
@outhor shkstart
@date 2019/11/29-17:26
*/

public class Demo01Sleep {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
