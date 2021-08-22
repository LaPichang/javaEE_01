package Static.demo05;

/**
 * 注：静态内容总是优先于非静态，所以静态代码块会比构造方法先执行
 *
 * 静态代码块典型用途：
 * 用来一次性地对成员变量进行赋值
 */

public class demo03 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
    }
}
