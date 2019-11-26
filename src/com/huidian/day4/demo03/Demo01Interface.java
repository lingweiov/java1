package com.huidian.day4.demo03;/*
@outhor shkstart
@date 2019/11/23-11:09
1.接口不能有静态代码块或者构造方法
2.一个类只有一个唯一父类，但是一个类可以实现多个接口
格式
public class Demo01Interface implements MyInterfaceA,MyInterfaceB{
//覆盖重写所有抽象方法
}
3.如果实现类所实现的多个接口当中，存在重复的抽象方法，那么只需要覆盖重写一次即可
4.如果实现类没有覆盖重写所有接口当中的所有抽象方法，那么实现类就必然是一个抽象类
5.如果实现类所实现的多个接口当中，存在重复的默认方法，
那么实现类一定要对冲突的默认方法覆盖重写
6.一个类如果在父类当中的方法和接口当中的方法产生了冲突，优先用父类
*/

public class Demo01Interface{


    public static void main(String[] args) {
        Zi zi=new Zi();
        zi.method();
    }
}
