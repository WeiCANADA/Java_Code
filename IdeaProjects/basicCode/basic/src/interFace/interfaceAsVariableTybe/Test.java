package interFace.interfaceAsVariableTybe;

public class Test {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("花木兰");
        /*SkillImpl skill = new SkillImpl();*/
        /*hero.setSkill(new SkillImpl());*///匿名对象

        //匿名内部类
        /*Skill skill = new Skill() {
            @Override
            public void skillMethod() {
                System.out.println("piu~piu~");
            }
        }*/

        //同时使用匿名内部类和内部对象
        hero.setSkill(new Skill() {
            @Override
            public void skillMethod() {
                System.out.println("piu~pia~piu~");
            }
        });
        hero.attack();
    }
}
