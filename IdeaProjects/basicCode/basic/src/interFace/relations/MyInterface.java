package interFace.relations;

public interface MyInterface extends InterfaceA, InterfaceB {

    public abstract void myMethod();

    @Override
    public default void methodDefault() {

    }
}
