package String.demo04;

/**
 * 字符串的截取
 *
 * public String substring(int index); 截取从参数位置一直到字符串末尾，返回新字符串
 * public String substring(int begin, int end); 截取从begin开始，一直到end结束，返回中间的字符串
 */

public class demo04 {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        String str3 = str1.substring(3,7);
        System.out.println(str2);
        System.out.println(str3);

    }
}
