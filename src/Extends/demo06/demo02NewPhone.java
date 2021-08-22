package Extends.demo06;

public class demo02NewPhone extends demo02Phone{

    @Override
    public void method1() {
        super.method1();
        System.out.println("显示头像");
        System.out.println("显示归属地");
    }
}
