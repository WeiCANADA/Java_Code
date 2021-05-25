package interFace.relations;

public interface InterfaceB {

    public abstract void methodB();
    public abstract  void methodCommon();////与InterfaceA的方法重名

    public default void methodDefault(){

    }

}
