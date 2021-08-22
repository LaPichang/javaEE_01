package Interface.demo07;

/**
 * 注意事项：不能通过 实现类对象 来调用接口当中的静态方法
 * 正确用法：通过接口名称，直接调用其中的静态方法
 * 格式：
 * 接口名称：静态方法名(参数);
 */

public class demo03Interface {
    public static void main(String[] args) {
        demo03FaceStatic.methodStatic();
    }
}
