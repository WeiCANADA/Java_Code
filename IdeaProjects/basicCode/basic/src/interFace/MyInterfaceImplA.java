package interFace;
/*
* 使用implements 实现接口,并Override所有方法
* */
public class MyInterfaceImplA implements MyInterfaceA {
    //实现类必须Override 所有接口方法里的abstract 方法,才能被调用.
    @Override
    public void methodAbs1() {
        System.out.println("abstract方法-->Override-->被调用");
    }

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
