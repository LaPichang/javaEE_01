package String.demo04;

import org.w3c.dom.ls.LSOutput;

/**
 * String当中与获取相关的常用方法有：
 * public int Length(); 获取字符串的长度
 * public String concat(String str); 将当前字符串和参数字符串拼接成为新的字符串
 * public char charAt(int index); 获取指定索引位置的单个字符（索引从0开始）
 * public int indexOf(String str); 查找参数字符串在本字符串当中首次出现的索引位置，如果没有则返回-1
 */

public class demo03 {
    public static void main(String[] args) {
        //获取字符串长度
        int length = "爱德华".length();
        System.out.println(length);

        //拼接字符串
        String str1 = "王得发";
        String str2 = "爱德华";
        String str3 = str1.concat(str2);
        System.out.println(str3);

        //字符串索引
        String stra = "javaagent";
        char ch = stra.charAt(5);
        int num = stra.indexOf("ag");
        System.out.println(ch);
        System.out.println(num);
    }
}