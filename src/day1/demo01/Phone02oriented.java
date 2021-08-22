package day1.demo01;

public class Phone02oriented {

    public static void main(String[] args) {
        Phone one = new Phone();
        one.color = "玫瑰金";
        one.count = 1999;
        one.brand = "Apple";
        getPhone(one);
        one.Call("乔布斯");
        one.Message();
        System.out.println("---------------------");
        one = putPhone();
        getPhone(one);
    }

    //将 对象类型 作为方法的参数
    public static void getPhone(Phone Ip){
        System.out.println(Ip.color);
        System.out.println(Ip.count);
        System.out.println(Ip.brand);
    }

    //将 对象类型 作为方法的返回值
    public static Phone putPhone(){
        Phone two = new Phone();
        two.color = "天空之镜";
        two.count = 3999;
        two.brand = "华为";
        return two;
        //此时传回的是 two 的地址值
    }
}
