package interFace.interfaceAsVariableTybe;

public class Test {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("��ľ��");
        /*SkillImpl skill = new SkillImpl();*/
        /*hero.setSkill(new SkillImpl());*///��������

        //�����ڲ���
        /*Skill skill = new Skill() {
            @Override
            public void skillMethod() {
                System.out.println("piu~piu~");
            }
        }*/

        //ͬʱʹ�������ڲ�����ڲ�����
        hero.setSkill(new Skill() {
            @Override
            public void skillMethod() {
                System.out.println("piu~pia~piu~");
            }
        });
        hero.attack();
    }
}
