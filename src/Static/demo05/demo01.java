package Static.demo05;

/**
 * 如果成员变量使用了static关键字，那么这个变量不属于对象
 * 而是属于所在的类，多个对象共享一份数据
 */

public class demo01 {
    public static void main(String[] args) {
        Person one = new Person(19,"爱德华");
        Person two = new Person(18,"王得发");
        one.room = "110班"; // room 被 static 修饰，所以 room 变量的内容被所有对象使用
        System.out.println("姓名：" + one.getName() +
                "年龄：" + one.getAge() +
                "班级：" + one.room +
                "学号：" + one.getId());
        System.out.println("姓名：" + two.getName() +
                "年龄：" + two.getAge() +
                "班级：" + two.room +
                "学号：" + two.getId());
    }
}
