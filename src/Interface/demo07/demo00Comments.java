package Interface.demo07;

/**
 * 使用接口的注意事项
 *
 * 1：接口是没有静态代码块或者构造方法的
 * 2：一个类的直接父类是唯一的，但一个类可以同时实现多个接口
 * 格式：
 * public class demo00 implements demo00faceA,demo00B{
 *     ...
 * }
 *
 * 3：如果实现类所实现的多个接口当中，存在重复的抽象方法，那么只需要覆盖重写一次即可
 * 4：如果实现类所实现的多个接口当中，存在重复的默认方法，那么实现类一定要对冲突的默认方法进行覆盖重写
 * 5：一个类的直接父类中的方法，和接口当中的默认方法产生了冲突，优先使用父类的方法
 */

public class demo00Comments {
}
