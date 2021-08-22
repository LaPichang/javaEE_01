package Practice.demo11;

public class demo02Main {

    public static void main(String[] args) {

        demo02Hero hero1 = new demo02Hero("AiLisi",new demo02ImplSkill());

        demo02Hero hero2 = new demo02Hero();
        hero2.setName("Jack");
        demo02Skill skill = new demo02ImplSkill();
        hero2.setSkill(skill);

        hero1.attact();
        System.out.println("--------------------");
        hero2.attact();

        //使用匿名内部类定义 skill2 内容
        demo02Skill skill2 = new demo02Skill() {
            @Override
            public void skill() {
                System.out.println("biu~biu~biu");
            }
        };
        hero2.setSkill(skill2);

        System.out.println("--------------------");
        System.out.println("Change hero2-skill");
        hero2.attact();
    }
}
