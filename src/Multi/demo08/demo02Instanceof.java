package Multi.demo08;

/**
 * 对象的向下转型：将父类对象“还原”为原本的子类对象
 * 格式：
 * 子类名称 对象名 = (子类名称)父类对象
 * 作用：可以在多态情况调用子类对象中的特有函数
 * <p>
 * instanceof 判断多态情况父类引用的对象是哪个子类
 * 格式：
 * 父类引用对象 instanceof 子类名
 * 返回值为 boolean 值
 */

public class demo02Instanceof {

    public static void main(String[] args) {

        demo02Fu pe1 = new demo02ZiA();

        method(pe1);
        method(new demo02ZiB()); //直接用匿名对象传参
    }

    public static void method(demo02Fu pe) {
        if (pe instanceof demo02ZiA) {
            demo02ZiA ZiA = (demo02ZiA) pe; //向下转型
            ZiA.methodZiA();
        }
        if(pe instanceof demo02ZiB){
           ((demo02ZiB) pe).methodZiB(); //不建立新的向下转型对象
        }
    }
}
