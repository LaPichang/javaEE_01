package Extends.demo06;

/**
 * 面向对象三大特征之继承性
 * 继承是多态的前提，没有继承就没有多态
 * 继承主要解决的问题是：共同抽取
 *
 * 继承关系当中的特点：
 * 1：子类可以拥有父类的内容
 * 2：子类还可以拥有自己专有的内容
 * 3：java是单继承，一个类的直接父类只有唯一一个
 * 4：java 可以多级继承
 * 5：一个父类可以有很多子类
 *
 *
 * 继承的格式：
 * 定义父类（一个普通的类定义）
 * public class 父类名称 {
 *     ......
 * }
 *
 * 定义子类
 * public class 子类名称 extends 父类名称 {
 *     ......
 * }
 *
 *
 * 注：当父类于子类的变量名或方法名相同时
 * 优先访问所创建的对象
 *
 *
 * 三种方法中变量情况
 * 1：局部变量：直接写成员变量名
 * 2：本类的成员变量：this.成员变量名
 * 3：父类的成员变量：super.成员变量名
 *
 *
 * 继承关系中的覆盖重写：父类和子类的成员方法名与参数列表都相同
 * 特点：创建的是子类对象，则优先使用子类
 * 检测：在使用的重写方法前写 @Override 可以检测是否为覆盖重写方法
 * 注意：子类方法的返回值必须小于等于父类方法的返回值
 *      子类方法的权限必须大于等于父类方法的权限修饰符
 * public > protected > （留空） > private
 */

public class demo01 {
    public static void main(String[] args) {
        demo01Fu fu = new demo01Fu(); //创建父类对象
        //只能引用父类的内容
        System.out.println(fu.num);
        System.out.println(fu.numfu);
        //用成员方法访问变量则以方法所在的类优先
        fu.method();
        System.out.println("---------------------");


        demo01Zi zi = new demo01Zi();//创建子类对象
        //既可以引用父类也可以引用子类
        System.out.println(zi.num);
        System.out.println(zi.numzi);
        System.out.println(zi.numfu);
        zi.method();
    }
}
