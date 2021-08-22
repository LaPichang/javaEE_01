package Practice.demo11;

public class demo01Hero {

    private String name;
    private int age;
    private demo01Weapon weapon;  //用自创的类作为成员变量使用
                                  //等价 demo01Weapon weapon = new demo01Weapon();

    public void attack(){
        System.out.println(name + "使用" + weapon.getCod() + "向你发起攻击!");
    }

    public demo01Hero() {
    }

    public demo01Hero(String name, int age, demo01Weapon weapon) {
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

    public demo01Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(demo01Weapon weapon) {
        this.weapon = weapon;
    }
}
