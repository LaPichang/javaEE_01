package ArrayList.demo03;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 * 题目：
 * 用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合中
 * 要求使用自定义方法实现筛选
 */

public class demo04 {
    public static void main(String[] args) {
        Random Num = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(Num.nextInt(100) + 1);
        }
        list1 = getlist(list);
        System.out.println("偶数有" + list1.size() + "个");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }
    public static ArrayList<Integer> getlist(ArrayList<Integer> list){
        ArrayList<Integer> listmin = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0){
                listmin.add(list.get(i));
            }
        }
        return listmin;
    }
}
