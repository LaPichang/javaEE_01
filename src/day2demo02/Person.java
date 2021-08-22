package day2demo02;

/**
 * 面向对象三大特征：封装、继承、多态
 * <p>
 * 封装性在java中的体现：
 * 1：方法就是一种封装
 * 2：关键字 private 也是一种封装
 * <p>
 * 用private关键字进行修饰
 * eg： private int num
 * 在本类当中依然可以随意访问
 * 但是在其他的类中便无法 直接访问
 * <p>
 * 间接访问private成员变量，就要定义一对 getter/setter方法
 * <p>
 * 必须写为set.../get...
 * 命名规则：
 * (但对于 boolean值 get... 方法需写成 is...)
 * 对于getter:不能有参数，返回值类型和成员变量对应
 * 对于setter:不能有返回值，参数类型和成员变对应
 */

public class Person {
    String name;
    private int age;
    private boolean sex;

    public void show() {
        System.out.println("姓名:" + name + "\n" + "年龄：" + age);
    }

    public void setAge(int num) {
        if (num >= 0) {
            age = num;
        } else {
            System.out.println("年龄信息不合法");
        }
    }

    public int getAge() {
        return age;
    }

    public void setSex(boolean mf) {
        sex = mf;
    }

    public boolean isSex() {
        return sex;
    }
}
