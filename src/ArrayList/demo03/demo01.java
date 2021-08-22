package ArrayList.demo03;

import java.util.ArrayList;

/**
 * 数组的长度创建后无法发生改变
 * 但是 ArrayList 集合的长度是可以发生随意变化的
 *
 * ArrayList 集合中 ， <E>代表泛型
 * 泛型：装在集合中的所有元素所统一的类型
 * 注：泛型只能是引用类型，不能是基本类型
 *
 * 注意事项：
 * ArrayList集合直接打印，得到的不是地址值，而是内容
 * 对于内容是空则得到的是空的中括号 []
 *
 * ArrayList 当中的常用方法有：
 * public boolean add(E e): 向集合中添加元素，参数类型和泛型一致
 * 注：public boolean add(E e)的返回值反映添加是否成功
 * 对于ArrayList集合，add添加一定是成功的，所以返回值可用可不用
 * 但是对于其他的集合，add添加动作不一定成功
 * public E get(int index): 从集合中获取元素，参数是索引编号，返回值是对应位置的元素
 * public E remove(int index): 从集合中删除元素，参数是索引编号，返回值是被删除的元素
 * 注：索引编号 = 数组脚标
 * public int size(): 获取集合的长度，返回值是集合中包含的元素个数
 * static void shuffle(List<?> list): 使用指定的随机源对指定列表进行置换，即随机打乱集合中的元素顺序
 * (注：shuffle方法需要用 Collections 类直接调用)
 */

public class demo01 {
    public static void main(String[] args) {
        //创建一个ArrayList集合，集合名称是list，里面是String类型数据
        ArrayList<String> list = new ArrayList<>();
        list.add("爱德华");
        list.add("王得发");
        list.add("香蕉皮");
        System.out.println(list);//显示集合中的内容
        String str = list.get(0);//list.get返回值的使用
        System.out.println("list中第一个元素是" + str);
        list.remove(0);//删除爱德华
        //删除第一个元素,原第二个元素会向前位移成为第一个元素
        //此时第一个元素为王得发
        //集合的遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println("第" + (i + 1) + "个元素是" + list.get(i));
        }
    }
}
