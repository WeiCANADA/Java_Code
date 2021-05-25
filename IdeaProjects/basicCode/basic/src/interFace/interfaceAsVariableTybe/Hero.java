package interFace.interfaceAsVariableTybe;

public class Hero {
    String name;
    Skill skill;

    public Hero() {
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
    public void attack(){
        System.out.println(name + "正在释放技能:");
        skill.skillMethod();
    }
}
