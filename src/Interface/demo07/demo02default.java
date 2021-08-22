package Interface.demo07;

/**
 * 接口中默认方法
 * 格式：
 * public default 返回值类型 方法名称（参数列表）{
 *     方法体
 * }
 *
 * 注：接口中的默认方法，可以解决接口升级的问题
 *
 *
 * 默认方法直接被 实现类对象 所调用，而不需要再往 实现类 中添加抽象方法的覆盖重现方法
 */

public interface demo02default {

    //抽象方法
    public abstract void methodAbs();

    //默认方法
    public default void methodDefault(){
        System.out.println("这是一个新添加的默认方法");
    }
}
