package Interface.demo07;

/**
 * 接口中可以定义“成员变量”
 * 格式：
 * public static final 变量类型 变量名 = 数据值;
 * 从效果上相当于接口的“常量”
 *
 * 注：
 * 1：一旦用 final 关键字修饰则说明不可改变
 * 2：接口常量可以省略 public static final
 * 3：接口常量必须进行赋值
 */

public interface demo05Const {

    public static final int num = 520;
}
