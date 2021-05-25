package classfengZhuang;

public class FengZhuang_Private {
    String name;
    private int age;

    public void show() {
        System.out.println("我叫" + name + "年龄" + age);
    }

    public void setAge(int age) {
        if(1 <= age && age <= 150){
        this.age = age;
        }else{
            System.out.println("输入的数据错误");
        }
    }

    public int getAge() {
        return age;
    }
}
