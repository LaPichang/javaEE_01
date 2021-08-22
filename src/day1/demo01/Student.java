package day1.demo01;

/**
 * 面向过程：当需要实现一个功能时，关注每一个具体的步骤，详细处理每一个细节
 * 效率高，面向过程强调代码的短小精悍，善于结合数据结构来开发高效率的程序
 * <p>
 * 面向对象：面向对象是一种以“对象”为中心的编程思想
 * 把要解决的问题分解成各个对象
 * 建立对象的目的不是为了完成一个步骤
 * 而是为了描叙某个对象在整个解决问题的步骤中的 属性 和 行为
 * 面向对象三大特征：封装、继承、多态
 */


/**
 * 定义一个类，用来模拟“学生”，其中有两部分组成：
 *
 * 属性（是什么）：
 *     姓名
 *     年龄
 * 行为（能做什么）：
 *     吃饭
 *     睡觉
 *     学习
 *
 *
 * 对应到 java类 当中：
 *
 * 成员变量（属性）：
 *    String name;  //姓名
 *    int age;      //年龄
 * 成员方法（行为）：
 *    public void eat(){}// 吃饭
 *    public void sleep(){}// 睡觉
 *    public void study(){}// 学习
 *
 * 注意事项：
 * 1：成员变量直接定义在 类 当中、方法 的外面
 * 2：成员方法不要写 static 关键词
 */

public class Student {
    //定义全局变量
    //成员变量
    String name;   //姓名
    int age;       //年龄

    //成员方法
    public void eat() {
        System.out.println("吃饭！");
    }

    public void sleep() {
        System.out.println("睡觉！");
    }

    public void study() {
        System.out.println("学习！");
    }
}
