package InnerClass.demo10;

/**
 * 如果接口的实现类（或者父类的子类）只需要使用唯一的一次
 * 那么就可以省略实现类的定义，使用 匿名内部类
 *
 * 格式：
 * 接口名称 对象名 = new 接口名称(){
 *   //覆盖所有抽象方法
 * };
 * 注：匿名内部类末尾有分号
 */

public class demo04Main {

    public static void main(String[] args) {

        demo04Inter obj = new demo04Inter() {
            @Override
            public void method() {
                System.out.println("匿名内部类方法实现覆盖重写");
            }
        };
        obj.method();
    }
}
