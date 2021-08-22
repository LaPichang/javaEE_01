package Interface.demo07;

/**
 * 1：类与类之间是单继承的，直接父类只有有一个
 * 2：类与接口直接是多实现的，一个类可以实现多个接口
 * 3：接口与接口之间是多继承的
 *
 * 注：
 * 1：多个父接口当中的抽象方法可以重复
 * 2：多个父接口当中的默认方法如果重复，那么子接口必须进行默认方法的覆盖重写
 */

public interface demo06InterfaceZ extends demo06InterfaceA,demo06InterfaceB{

    public abstract void method();
}
