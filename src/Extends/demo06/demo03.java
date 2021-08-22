package Extends.demo06;

/**
 * 继承关系中，父子类的构造方法的访问特点：
 * 1：子类构造方法当中有一个默认隐含的 "super()" 调用，所以一定是先调用父类构造再调用子类构造
 * 2：子类构造可以通过 super 关键字来调用父类重载构造
 * 3：super 的父类构造调用，必须是子类构造方法的第一个语句，不能一个子类构造用多次 super
 */

public class demo03 {

    public static void main(String[] args) {

        demo03Zi Zi = new demo03Zi();
        demo03Zi zi = new demo03Zi(5);
    }
}
