package interFace.relations;

public interface InterfaceA {

    public abstract void methodA();
    public abstract  void methodCommon();//与InterfaceB的方法重名

    public default void methodDefault(){

    }
}
