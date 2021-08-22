package Static.demo05;

/**
 * 成员方法被 static 修饰后就会成为静态方法
 */

public class MyClass {
    int num1 = 0; //成员变量
    static int num2 = 1; //静态变量

    //成员方法
    public void method(){
        System.out.println("这是一个成员方法");
        //成员方法可以访问成员变量和静态变量
        System.out.println(num1+num2);
    }

    //静态方法
    public static void methodStatic(){
        System.out.println("这是一个静态方法");
        //静态方法可以访问静态变量，但不能访问成员变量
        //System.out.println(num1); （错误）
        System.out.println(num2);

        //静态方法中不能使用 this 关键字
        //System.out.println(this); （错误）
    }
}
