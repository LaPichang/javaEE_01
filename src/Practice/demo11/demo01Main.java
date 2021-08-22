package Practice.demo11;

public class demo01Main {

    public static void main(String[] args) {

        //直接创建 hero 对象时初始化
        demo01Hero hero1 = new demo01Hero("AiDehua",10,new demo01Weapon("Frostmourne"));

        //创建 hero 对象后填入数据
        demo01Hero hero2 = new demo01Hero();
        hero2.setName("WanDefa");
        hero2.setAge(20);
        demo01Weapon weapon = new demo01Weapon("AK_47");
        hero2.setWeapon(weapon);

        hero1.attack();
        hero2.attack();
    }
}
