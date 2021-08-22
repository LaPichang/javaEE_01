package Practice.demo11;

public class demo02Hero {

    private String name;
    private demo02Skill skill;
    //等价 demo02ImplSkill skill = new demo02ImplSkill 创建了一个实现类对象

    public demo02Hero() {
    }

    public demo02Hero(String name, demo02Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public void attact(){
        System.out.println(name + "use skill:" );
        skill.skill();
        System.out.println("skill end");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public demo02Skill getSkill() {
        return skill;
    }

    public void setSkill(demo02Skill skill) {
        this.skill = skill;
    }
}
