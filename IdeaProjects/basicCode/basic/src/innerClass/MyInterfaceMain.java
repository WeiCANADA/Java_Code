package innerClass;

public class MyInterfaceMain {
    public static void main(String[] args) {
        MyInterface interbace = new MyInterface() {
            @Override
            public void method() {
                System.out.println("�����ֲ��ڲ��෽��ִ��");
            }
        };
        interbace.method();
    }
}
