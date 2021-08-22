package Interface.demo07;

/**
 * 普通私有方法：解决多个默认方法之间重复代码问题
 * 格式：
 * private 返回值类型 方法名称(){
 *     方法体
 * }
 *
 * 静态私有方法：解决多个静态方法之间重复代码问题
 * 格式：
 * private static 返回值类型 方法名称(){
 *     方法体
 * }
 */

public interface demo04private {

    private void methodPrivate1(){
        System.out.println("普通私有方法执行");
        System.out.println("AAAAA");
    }

    private static void methodPrivate2(){
        System.out.println("静态私有方法执行");
        System.out.println("BBBBB");
    }

    public default void methodDefault(){
        System.out.println("默认方法执行");
        methodPrivate1();
    }

    public static void methodStatic(){
        System.out.println("静态方法执行");
        methodPrivate2();
    }
}
