package innerClass;

public class Body {
    private String name;
    String a = "�ⲿ��ĳ�Ա����";
    //�ڲ�����heart
    public class Heart{
        String a = "�ڲ���ĳ�Ա����";

        public void beat(){
            System.out.println("��������,�ıı�");
        }
        public void variableHeart(){
            System.out.println(a);
            System.out.println(this.a);
        }
        }
    //�ⲿ����

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
        System.out.println("�ⲿ����ִ��!");
        Heart heart = new Heart();//ͨ���ⲿ���������ڲ�����
        heart.beat();
    }
    public void variableBody(){
        String a = "�ڲ��෽���ĳ�Ա����";
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Body.this.a);//���������Ա�ı����ķ���
    }
}
