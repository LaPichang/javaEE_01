package day2demo02;

import java.util.Random;

/**
 * Random 用来生成随机数字
 *
 * 1：导包
 * import java.util.Random;
 * 2：创建
 * Random re = new Random();
 * 3：使用
 * 获取一个随机的 int 数字：      int num = re.nextInt();
 * 获取一个随机的 0~(n-1) 的数字： int num = re.nextInt(n);
 * 获取一个随机的 a~n+a-1 的数字：    int num =re.nextInt(n) + a;
 */

public class Demo04Random {
    public static void main(String[] args) {
        Random re = new Random();
        int num1,num2,num3;
        for (int i = 0; i < 5; i++) {
            num1 = re.nextInt();
            num2 = re.nextInt(5);
            num3 = re.nextInt(5) + 5;
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
        }
    }
}
