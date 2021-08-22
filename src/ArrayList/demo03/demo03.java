package ArrayList.demo03;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * 将对象储存到集合中
 */

public class demo03 {
    public static void main(String[] args) {
        Person peo = new Person();
        ArrayList<Person> list = new ArrayList<>();
        Person one = new Person("爱德华",20);
        Person two = new Person("王得发",25);
        Person three = new Person("王二麻",30);
        list.add(one);
        list.add(two);
        list.add(three);
        for (int i = 0; i < list.size(); i++) {
            peo = list.get(i);
            System.out.println("姓名:" + peo.getName() + ",年龄:" + peo.getAge());
        }
    }
}
