package Final.demo09;

/**
 * final关键字代表最终的、不可改变的
 * 包括四种用法
 * 1：修饰类
 * 格式：
 * public final class 类名称{
 *     ...
 * }
 * 被 final 所修饰的类不能有子类（太监类），其中的所有成员方法都不能覆盖重写
 *
 * 2：修饰方法
 * 格式：
 * public final 返回值类型 方法名(){
 *     方法体
 * }
 * 被 final 修饰的方法为 最终方法 ，不可被覆盖重写
 * 注：final 和 abstract 互相矛盾，不可以同时使用
 *
 * 3：修饰局部变量
 * 格式：
 * final 类型名 变量名;
 * 被 final 修饰的变量只能进行一次赋值，之后便不可改变
 * 注：基本类型不可改变的是数据，引用类型不可改变的是地址
 *
 * 4：修饰成员变量
 * 格式：
 * private final 类型名 变量名;
 * 被 final 修饰的变量无法改变
 * 注：1：成员变量有默认值，所以在 final 之后必须手动赋值
 * 2：可以使用直接赋值也可以用构造方法赋值，二者选其一
 * 3：若使用构造方法赋值，则要在 无参构造中 写入赋值语句
 */

public class demo01 {

    private final int num1;
    private final int num2 = 20;

    public demo01() {
        num1 = 10;
    }

    public demo01(int num) {
        this.num1 = num;
    }
}
