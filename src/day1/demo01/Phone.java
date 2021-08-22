package day1.demo01;

/**
 * 创建一个“手机”的 类
 * 1：属性：颜色、价格、品牌
 * 2：行为：打电话、发短信
 */

public class Phone {
    String color;
    int count;
    String brand;

    public void Call(String name) {
        System.out.println("打电话给" + name);
    }

    public void Message() {
        System.out.println("群发短信");
    }
}
