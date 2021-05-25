package classAsBianLiangTybe;

public class Hero {
     private String name;
     private int age;
     private Weapon weapon;

    public Hero() {
    }

    public Hero(String name, int age, Weapon weapon) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public void attack(){
        System.out.println("年龄" + age + "的" + "英雄" + name + "正在使用" + weapon.getCode() + "武器" +"进行攻击");
    }
}
