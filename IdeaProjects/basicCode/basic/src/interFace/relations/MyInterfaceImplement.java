package interFace.relations;

public class MyInterfaceImplement implements MyInterface {
    @Override
    public void myMethod() {

    }

    @Override
    public void methodA() {

    }

    @Override
    //在InterfaceA与InterfaceA中的重复方法,只需要Override一次.
    public void methodCommon() {

    }

    @Override
    public void methodB() {

    }
}
