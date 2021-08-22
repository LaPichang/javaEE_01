package ArrayList.demo03;

import java.util.ArrayList;
import java.util.Random;

/**
 * 如果要在 ArrayList 中存储基本类型，必须使用类型对应的“包类型”
 *
 * 基本类型         包类型（引用类型，位于java.lang包下）
 * byte            Byte
 * short           Short
 * int             Integer
 * long            Long
 * float           Float
 * double          Double
 * char            Character
 * boolean         Boolean
 * string          String
 */

public class demo02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random re = new Random();
        for (int i = 0; i < 5; i++) {
            list.add(re.nextInt(5) + 1);
        }
        System.out.println(list);
    }
}
