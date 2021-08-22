package Multi.demo08;

public class demo03Main {

    public static void main(String[] args) {

        demo03Computer computer = new demo03Computer();
        computer.powerOn();

        demo03USB mouse = new demo03Mouse(); //多态写法
        computer.UseDevice(mouse);

        demo03Keyboard keyboard = new demo03Keyboard(); //非多态写法
        //方法参数为接口，可传入接入了该接口的实现类，会自动发生向上转型
        //同 computer.UseDevice(new keyboard)
        computer.UseDevice(keyboard);

        computer.powerOff();
    }
}
