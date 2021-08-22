package Interface.demo07;

/**
 * 接口是多个类的公共规范
 * 接口是引用数据类型，最重要的内容是其中的抽象方法
 *
 * 定义一个接口的格式：
 * public interface 接口名称{
 *     //接口内容
 * }
 *
 * 注：
 * 1：接口当中的抽象方法，修饰符必须是固定的两个关键字： public abstract
 * 2：两个关键字修饰符可以选择性的省略
 *
 *
 * 接口使用步骤：
 * 1：接口不能直接使用，必须有一个“实现类”来实现该接口
 * 格式：
 * public class 实现类名称 implements(实现) 接口名称{
 *     //...
 * }
 * 2：接口的实现必须覆盖重写（实现）接口中的所有抽象方法
 * 3：创建实现类的对象，进行使用
 * 注：如果 实现类 没有覆盖重新接口的所有抽象方法，那么 实现类 必须是抽象方法
 */

public interface demo01 {

    //不省略
    public abstract void methodAbs1();

    //两个都省略

    void methodAbs2();
}
