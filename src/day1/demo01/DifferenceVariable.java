package day1.demo01;

/**
 * 局部变量和成员变量
 *
 * 1：定义的位置不一样
 * 局部变量：定义在方法内部
 * 成员变量：在方法外部，直接写在类当中
 *
 * 2：作用范围不一样
 * 局部变量：只有在方法中可以使用，出了方法后不可再用
 * 成员变量：整个类都可以通用
 *
 * 3：默认值不一样
 * 局部变量：没有默认值，如果要使用，必须手动进行赋值
 * 成员变量：如果没有赋值，会有默认值，规则和数组一样
 *
 * 4:内存位置不一样
 * 局部变量：位于栈内存
 * 成员变量：位于堆内存
 */


public class DifferenceVariable {
    String name;           // 成员变量
    public void method(){
        int num = 20;      // 局部变量
        System.out.println(num);
        System.out.println(name);//有默认值
    }

}
