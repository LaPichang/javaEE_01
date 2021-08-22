package String.demo04;

/**
 * 字符串的特点：
 * 1：字符串的内容只要被创建就不可改变
 * 2：字符串的内容可以共享
 * 3：字符串效果上是char[]字符数组，但底层原理是byte[]字节数组
 *
 * 创建字符串常见的 3 + 1 种方式
 * 三种构造方法：
 * public String(); 创建一个空字符串，不含任何内容
 * public String(char[] array); 根据字符数组的内容创建对应的字符串
 * public String(byte[] array); 根据字节数组的内容创建对应的字符串
 * 一种直接创建方法：
 * String str = "Hello World"
 *
 * 注：
 * 1：对于引用类型来说，== 比较的是地址值
 * 2：双引号内直接写的字符串是在常量池当中，而 new 的不会在常量池中
 */

public class demo01 {
    public static void main(String[] args) {
        //空参构造
        String str1 = new String();
        System.out.println("第一个字符串" + str1);

        //根据字符数组创建字符串
        char[] ch = {'A','B','C'};
        String str2 = new String(ch);
        System.out.println("第二个字符串" +  str2);

        //根据字节数组创建字符串
        byte[] by = {'a','b','c'};
        String str3 = new String(by);
        System.out.println("第三个字符串" + str3);

        //直接创建字符串
        String str4 = "爱德华";
        System.out.println("第四个字符串" + str4);
    }
}
