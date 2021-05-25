package innerClass;

public class Body {
    private String name;
    String a = "外部类的成员变量";
    //内部方法heart
    public class Heart{
        String a = "内部类的成员变量";

        public void beat(){
            System.out.println("心脏跳动,蹦蹦蹦");
        }
        public void variableHeart(){
            System.out.println(a);
            System.out.println(this.a);
        }
        }
    //外部方法

    public Body() {

    }

    public String getName() {
        return name;
    }

    public Body(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void body() {
        System.out.println("外部方法执行!");
        Heart heart = new Heart();//通过外部方法调用内部方法
        heart.beat();
    }
    public void variableBody(){
        String a = "内部类方法的成员变量";
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Body.this.a);//调用外类成员的变量的方法
    }
}
