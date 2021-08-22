package Multi.demo08;

/**
 * 代码中的多态性：父类引用指向子类对象（向上转型）
 *
 * 格式：
 * 1：父类名称 对象名 = new 子类名称();
 * 2：接口名称 对象名 = new 实现类名称();
 *
 * 间接向上转型：
 * 子类名称 对象名 = new 子类名称();
 * 父类名称 对象名 = 子类对象名;
 *
 *
 * 访问成员变量两种方式：
 * 1：直接通过成员对象访问成员变量，优先等号左边的类型，没有则向上找
 * 2：间接通过成员方法访问成员变量，优先该方法所属的类，没有则向上找
 *
 * 注：
 * 成员变量：编译看左，运行看左
 * 成员方法：编译看左，运行看右
 */

public class demo01main {

    public static void main(String[] args) {

        //父类引用指向子类对象
        demo01Fu pe = new demo01Zi();
        System.out.println(pe.num); //父类中的成员变量，且无法直接访问子类的成员变量
        //若子类的成员方法覆盖重写了父类的成员方法，则会优先使用子类
        pe.method(); //子类所覆盖重写的成员方法，间接访问到了子类的成员变量
        pe.methodFu(); //可以访问父类专属方法，但无法访问子类专属方法
    }
}