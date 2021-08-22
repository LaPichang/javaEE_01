package InnerClass.demo10;

/**
 * 一个类包含另一个类
 * 1：成员内部类
 * 2：局部内部类（包含匿名内部类）
 *
 * 格式：
 * 修饰符 class 外部类名称{
 *     修饰符 class 内部类名称{
 *         ...
 *     }
 * }
 * 注：内部类可随意访问外部类，外部类需要内部类对象才能访问内部类
 *
 * 外部类访问内部类方式：
 * 1：间接访问：在外部类的方法中，使用内部类的对象，间接访问内部类
 * 2：直接访问：公式：
 * 外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称;
 */

public class demo01 {

    public class demo01InnerClass{

        public void methodInner(){
            System.out.println("内部类方法");
            System.out.println("我是" + str);
            method();
        }
    }

    //外部类变量
    private String str;

    public void Lookoutinner(){
        demo01InnerClass innerClass = new demo01InnerClass();
        innerClass.methodInner();
    }

    public void method(){
        System.out.println("外部类方法");
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
