package interFace;

public interface MyInterfaceB {
    public abstract void methodAbs1();//与MyInterface 的方法重名

    public default void methodDefault(){
        System.out.println("default方法可以Override,也可以直接被调用");
    }
}
