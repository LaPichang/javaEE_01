package Extends.demo06;

/**
 * 抽象方法：有 abstract 修饰的方法
 * 抽象类：class 前写 abstract
 * 注：抽象方法必须写在抽象类中
 *
 *
 * 如何使用抽象类和抽象方法：
 * 1：不能直接创建 new 抽象对象
 * 2：必须用一个子类来继承抽象父类
 * 3：子类必须覆盖重写抽象父类当中所有的抽象方法
 * （覆盖重写/实现方法[快捷键 Alt+Enter]：子类去掉抽象方法的abstract关键字，然后补上方法体大括号）
 * 4：创建子类对象
 */

public abstract class AbstractFu {

    //一个代表吃的抽象方法
    public abstract void eat();

    //普通成员方法
    public void method(){

    }
}
