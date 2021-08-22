package String.demo04;

/**
 * 对字符串的内容进行比较，可以使用两个方法
 * 1： public boolean equals(Object obj);
 * 参数可以是任何对象
 * 但只有参数为字符串且内容相同才会返回 ture ，否则返回 false
 * 注意事项：
 * a：任何对象都能用 object 进行接收
 * b：equals 方法具有对称性，即 a.equals(b) 和 b.equals(a)效果一样
 * c：如果比较双方是一个常量和一个变量，推荐把常量字符串写在前面
 * 推荐 "abc".equals(str)   不推荐 str.equals("abc")
 *
 * 2： public boolean equalsIgnoreCase(String str);
 * 可以忽略大小写进行比较
 */

public class demo02 {
    public static void main(String[] args) {
        String str1 = "Edward";
        String str2 = "edward";
        char[] ch1 = {'E','d','w','a','r','d'};
        System.out.println("Edward".equals(str1));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(ch1));//需要是两个字符串才能为 ture
        System.out.println(str1.equalsIgnoreCase(str2));
    }
}
