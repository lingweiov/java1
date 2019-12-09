package ov.day10.FunctionInterface;/*
@outhor shkstart
@date 2019/12/6-21:25
*/

;

public class Demo01 {
    public static void show(MyFunctionInterface myInter) {
        myInter.method();
    }

    public static void main(String[] args) {
        show(new MyFunctionInterfaceImpl());
        show(new MyFunctionInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写接口中的抽象方法");
            }
        });
        show(() -> {
            System.out.println("使用Lambda表达式重写接口中的抽象方法");
        });
        show(() ->
                System.out.println("使用Lambda表达式重写接口中的抽象方法")
        );
    }
}
