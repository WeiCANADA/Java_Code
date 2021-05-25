package interFace;

public class MyInterfaceImplAB implements MyInterfaceA ,MyInterfaceB {

    @Override
    public void methodDefault() {

    }////对于同时实现MyInterfaceA ,MyInterfaceB中重名的default方法,必须覆盖重写.

    @Override
    public void methodAbs1() {

    }//对于同时实现MyInterfaceA ,MyInterfaceB中重名的abstract方法,只需要覆盖重写一次.
    @Override
    public void methodAbs2() {

    }

    @Override
    public void methodAbs3() {

    }

    @Override
    public void methodAbs4() {

    }
}
