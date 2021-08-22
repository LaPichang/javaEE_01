package day1.demo01;

import java.util.Arrays;

/**
 * java.util.Arrays 常用工具方法：
 *
 * public static String toString(数组); 将参数数组变成字符串（按照默认格式：[元素1,元素2,元素3...]）
 * public static void sort(数组); 按照默认升序（从小到大）对数组元素进行排序
 *
 * 注：
 * 1：数值，sort默认从小到大排序
 * 2：字符串，sort默认按照字母升序
 * 3：如果是自定义类型，那么这个自定义类型要有 Comparable 或 Comparator 接口支持
 */

public class Demo03Arrays {
    public static void main(String[] args) {
        int[] num = {100,20,30,5,80};
        String str1 = Arrays.toString(num);
        Arrays.sort(num);
        System.out.println(str1);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
