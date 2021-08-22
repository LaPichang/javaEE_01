package day1.demo01;

public class Demo01 {
    public static void main(String[] args) {
        //赋值调用
        int result;
        result = sum(10,20);
        System.out.println("result = " + result);
        System.out.println("--------------------");
        //打印调用
        System.out.println(sum(10,15));
        System.out.println(sum(19,29,39));
    }

    //方法的重载：方法的名称相同，但是参数列表不同
    /*
   方法重载与下列因素有关：
   1：参数的个数不同
   2：参数的类型不同（double,int...）
   3：参数多类型顺序不同（double,int）/(int,double)
    */

    /**
     * 注：
     * 任何数据类型都能作为方法的参数或者返回值
     */


    public static int sum(int a, int b) {
        System.out.println("方法执行");
        int result = a + b;
        return result;
    }
    public static int sum(int a,int b,int c) {
        return a + b + c;
    }
}
