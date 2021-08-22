package Static.demo05;

import java.lang.management.MemoryType;

public class demo02 {
    public static void main(String[] args) {
        //没有 static 修饰的成员方法需要先创建对象，才能使用
        MyClass obj = new MyClass();
        obj.method();

        //对于静态方法，可以通过对象名进行调用，也可以直接用类名称调用
        obj.methodStatic(); //在 javac 中会翻译为 MyClass.methodStatic
        MyClass.methodStatic(); //推荐写法
    }
}
