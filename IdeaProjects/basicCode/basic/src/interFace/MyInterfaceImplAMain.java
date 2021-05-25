package interFace;

public class MyInterfaceImplAMain {
    public static void main(String[] args) {
        MyInterfaceImplA myInterfaceImplA = new MyInterfaceImplA();

        myInterfaceImplA.methodAbs1();//"abstract方法-->Override-->被调用"
        myInterfaceImplA.methodDefault();//default方法可以Override,也可以直接被调用"
        MyInterfaceA.methodStatic();//使用接口名称.static方法()直接调用static方法
    }
}
