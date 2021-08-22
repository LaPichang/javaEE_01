package day1.demo01;

/**
 * 两种常见的初始化方式：
 * 1：动态初始化（指定长度）
 * 2：静态初始化（指定内容）
 *
 * 动态初始化数组的格式：
 * 数据类型[] 数据名称 = new 数据类型[数据长度];
 *
 * 解析含义：
 * 左侧数据类型：数组中保存的数据，全都是统一的类型
 * 左侧的中括号：代表该类型为数组
 * 左侧数组名称：人为取名
 * 右侧的new：代表创建数组的动作
 * 右侧的数据类型：必须和左侧的数据类型保持一致
 * 右侧的中括号：数组当中可保存多少数据
 * 等号将右边新建数组的地址传给左边的数组名称
 *
 * 例：
 * int[] arrayA = new int [300];
 * double[] arrayB = new double[10];
 * String[] arrayC = new String[5];
 *
 * 注意事项：
 * 1：数组的初始化可拆分为两个步骤
 * eg:
 * int[] arrayA;
 * int[] arrayB;
 * arrayA = new int[] {10,20,30};
 * arrayB = new int[5];
 * 2:静态初始化可用省略格式，但省略格式不能拆分为两个步骤
 * eg: int[] arrayC = {10,20,30};
 *
 * 获得数组长度：
 * 数组名称.length
 * eg：
 * arrayA.length
 * 注：数组一旦创建，程序运行期间，长度不可改变
 *
 * for循环快捷键:
 * （循环次数N）.fori 可自动生成循环 N 次的代码
 * （数组名称）.fori 可自动生成循环 （数组长度.length）次的代码
 * eg:
 * 5.fori
 * arrayA.fori
 */


public class Demo02Array {
    public static void main(String[] args) {
        int[] arrayA = new int[5];
        int[] arrayB = arrayA;    //将 数组arrayA 的地址给arrayB
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = i + 1;   //给arrayA赋值
        }
        arrayB[0] = arrayA[2];
        //此时 arrayB 所指向的是 arrayA 的地址
        //所以修改 arrayB 相当于修改了 arrayA
        for (int i = 0; i < arrayB.length; i++) {
            System.out.println(arrayA[i]);
        }
        System.out.println("------------------------------");
        arrayB[0] = 1;
        //将数组反向
        for (int i = 0; i < arrayA.length; i++) {
            if(i >= arrayA.length / 2){
                int tem = arrayA[i];
                arrayA[i] = arrayA[arrayA.length - 1 - i];
                arrayA[arrayA.length - 1 - i] = tem;
            }
        }
        Printarray(arrayA);       //方法的调用
        System.out.println("------------------------------");
        int[] arrayC = Calculation(1,2,3);
        System.out.println(arrayC[0]);
        System.out.println(arrayC[1]);
    }


    //用额外的 方法 来遍历打印数组
    //传入的是数组的地址值
    public static void Printarray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    //返回值是数组
    public static int[] Calculation(int a,int b,int c){
        int sum = a + b + c;
        int count = sum / 3;
        int[] array = {sum,count};      //数组的初始化可以放入变量
        return array;
    }
}
