package polymorphism;

public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    //子类Cat的特有方法
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
