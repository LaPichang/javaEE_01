package day2demo02;

//猜数字

import java.util.Random;
import java.util.Scanner;

public class Demo04Randomgame {
    public static void main(String[] args) {
        while(true) {
            Random re = new Random();
            Scanner scanf = new Scanner(System.in);
            int num1 = re.nextInt(100) + 1;
            int op;
            while (true) {
                System.out.println("请输入猜测的数字");
                int num2 = scanf.nextInt();
                if (num2 < num1) {
                    System.out.println("猜的数字小了");
                }
                if (num2 > num1) {
                    System.out.println("猜的数字大了");
                }
                if (num2 == num1) {
                    System.out.println("恭喜你猜对了！");
                    break;
                }
            }
            System.out.println("是否继续游戏？1/0");
            op = (char) scanf.nextInt();       //强制类型转换
            if(op == 1){
                System.out.println("游戏继续，随机数重置");
                continue;
            }else if(op == 0){
                System.out.println("欢迎下次光临！");
                break;
            }else{
                System.out.println("输入非法选择！程序退出");
                break;
            }
        }
    }
}
