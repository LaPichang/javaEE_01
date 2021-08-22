package String.demo04;

/**
 * 分割字符串的方法：
 * public String[] split(String regex); 按照参数规则，将字符串分切为若干部分
 * 注：split方法是一个”正则表达式“
 * 如果要按照英文句点 "." 进行划分，必须写 "\\."
 */

public class demo06 {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        String[] array1 = str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("-----------------");

        String str2 = "aaa bbb ccc";
        String[] array2 = str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("-----------------");

        String str3 = "aaa.bbb.ccc";
        String[] array3 = str3.split("\\.");
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }
}
