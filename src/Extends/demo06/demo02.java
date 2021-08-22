package Extends.demo06;

public class demo02 {

    public static void main(String[] args) {

        demo02Phone Phone = new demo02Phone();
        Phone.method1();
        Phone.method2();
        Phone.method3();

        System.out.println("-----------------");

        demo02NewPhone NewPhone = new demo02NewPhone();
        NewPhone.method1();
        NewPhone.method2();
        NewPhone.method3();
    }
}
