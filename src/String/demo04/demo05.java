package String.demo04;

/**
 * String当中与转换相关的方法
 *
 * 1：public char[] toCharArray(); 将当前字符串拆分为字符数组作为返回值
 * 2：public byte[] getBytes(); 获得当前字符串底层字节数组
 * 3：public String replace(CharSequence oldString, CharSequence newString);
 * 将所有出现的 oldString 替换为 newString,返回替换后的新字符串
 */

public class demo05 {
    public static void main(String[] args) {
        //转换为字符数组
        char[] ch = "Hello".toCharArray();
        System.out.println(ch[0]);
        System.out.println(ch.length);
        System.out.println("-------------------");

        //转换为字节数组(ASCII码)
        byte[] by = "abc".getBytes();
        for (int i = 0; i < by.length; i++) {
            System.out.println(by[i]);
        }
        System.out.println("-------------------");

        //字符串内容的替换
        String str1 = "How do you do?";
        String str2 = str1.replace("o","*");
        System.out.println(str1);
        System.out.println(str2);
        String str3 = "李四在西市花四十四元买了四十四斤西红柿";
        String str4 = str3.replace("四十四","八十八");
        System.out.println(str3);
        System.out.println(str4);
    }
}
