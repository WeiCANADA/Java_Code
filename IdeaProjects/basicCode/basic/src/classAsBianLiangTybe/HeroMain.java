package classAsBianLiangTybe;

public class HeroMain {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("张三丰");
        hero.setAge(98);
        //创建一个武器对象
        Weapon weapon = new Weapon("鸡毛掸子");
        //为英雄配备武器
        hero.setWeapon(weapon);
        hero.attack();
    }
}
