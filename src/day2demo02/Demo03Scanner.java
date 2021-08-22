package day2demo02;


import java.util.Scanner;

/**
 * Scanner类 可以实现键盘的输入数据到程序中
 *
 * 引用类型一般使用步骤：
 * 1：导包
 * import 包路径.类名称
 * 注：在类中写 Scanner 时编译器会自动补齐导包，也可以Alt+Enter补齐
 * 如果需要使用的目标类和当前类位于同一个包下，则可以省略包语句不写
 * 只有 java.lang 包下的内容不需要导包，其他包都需要import语句
 *
 * 2：创建
 * 类名称 对象名 = new 类名称();
 *
 * 3：使用
 * 对象名.成员方法名();
 */

public class Demo03Scanner {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int[] num = new int[5];
        int tem;
        System.out.println("请输入" + num.length + "个数");
        for (int i = 0; i < num.length; i++) {
            num[i] = scanf.nextInt();
        }
        for (int i = 0; i < num.length - 1; i++) {
            for (int i1 = 0; i1 < (num.length - i - 1); i1++) {
                if(num[i1] > num[i1 + 1]){
                    tem = num[i1];
                    num[i1] = num[i1 + 1];
                    num[i1 + 1] = tem;
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
