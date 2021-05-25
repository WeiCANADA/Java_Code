package innerClass;

public class MyInterfaceMain {
    public static void main(String[] args) {
        MyInterface interbace = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名局部内部类方法执行");
            }
        };
        interbace.method();
    }
}
