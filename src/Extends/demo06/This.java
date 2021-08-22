package Extends.demo06;

/**
 * This 的三种典型用法
 *
 * 1：在本类的成员方法中访问本类的成员变量
 * 2：在本类的成员方法中访问本类的另一个成员方法
 * 3：在本类的构造方法中访问另一个构造方法
 * 注：This() 方法的调用需是构造方法的第一个语句
 *    This() 和 super() 不能共同使用
 */

public class This {
    int num;

    public This() {
        System.out.println("构造函数调用");
    }

    public This(int num) {
        this(); //调用无参构造
        this.num = num;
    }

    public void method(){
        System.out.println("成员方法调用");
    }

    public void method(int num){
        this.method();
    }
}
