package interFace;/*
/*
创建一个接口*/

public interface MyInterfaceA {

    public static final int NUM_IN_INTERFACE = 10;

//abstract 方法
    public abstract void methodAbs1();
    public  void methodAbs2();
    abstract void methodAbs3();
    void methodAbs4();

    // default 方法 可以被实现类覆盖重新,也可以被直接调用.
    public default void methodDefault(){
        System.out.println("default方法可以Override,也可以直接被调用");
    }

    //static 方法
    public static void methodStatic(){
        System.out.println("使用接口名称.static方法()直接调用static方法");
    }
}
