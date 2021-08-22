package day1.demo01;


/**
 * 通常情况下，一个 类 不能直接使用，需要根据 类 创建一个对象，才能使用
 *
 * 1：导包：指出需要的 类 在什么位置
 * 格式： import 包名称.类名称
 * eg: import day16.demo01.Student
 * 对于和当前 类 属于同一个包的情况，可以省略导包语句不写
 *
 * 2：创建：
 * 格式： 类名称 对象名 = new 类名称（）；
 * eg: Student stu = new Student();
 *
 * 3：使用，分两种情况：
 * 使用成员变量： 对象名.成员变量名
 * 使用成员方法： 对象名.成员方法名（参数）
 */


public class Student02oriented {
    public static void main(String[] args) {
        //1：导包（省略）
        //2：创建
        Student stu = new Student();
        stu.name = "爱德华";
        stu.age = 18;
        //3：使用成员变量
        System.out.println(stu.name);
        System.out.println(stu.age + "周岁");
        //4：使用成员变量
        stu.study();
        stu.eat();
        stu.sleep();
    }
}
