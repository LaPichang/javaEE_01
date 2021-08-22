package InnerClass.demo10;

/**
 * 权限修饰符 ： public > protected > (default) > private
 *
 * 局部内部类：
 * 格式：
 * public class 外部类名称{
 *     修饰符 返回值类型 方法名{
 *         class 局部内部类名称{
 *             ...
 *         }
 *     }
 * }
 *
 * 注：定义一个类时，权限修饰符规则：
 * 1：外部类： public / (default)
 * 2：成员内部类： public / protected / (default) / private
 * 3：局部内部类： 无
 *
 * 在局部内部类中，如果要访问所在方法的成员变量，必须保证局部变量是 “有效的final变量”
 * 注：若能保证局部变量不会改变，则 final 可省略
 * 原因：new出的对象存在堆内存，而局部变量存在栈内存
 * 方法结束时局部变量出栈销毁，而new对象还存在于堆内存
 */

public class demo03 {

    public void method(){

        int num = 520;

        class demo03InnerClass{

            public void Inner_method(){

                System.out.println(num);
            }
        }
        demo03InnerClass Inner = new demo03InnerClass();
        Inner.Inner_method();
    }
}
