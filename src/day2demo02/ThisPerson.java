package day2demo02;

/**
 * 当成员变量名与局部变量名相同时
 * 会采取就近原则，以局部变量优先
 * 可用 this.变量名 来表达成员变量
 *
 *
 * 构造方法：是用来专门创建对象的方法
 * 用关键字 new 创建对象时就是在调用构造方法
 *
 * 格式：
 * public 类名称（参数类型 参数名称){
 *     方法体
 * }
 *
 * 注意事项：
 * 1：构造方法的名称必须和所在的类名称完全一样
 * 2：构造方法不用写返回值类型或void
 * 3：构造方法不能 return 一个具体的返回值
 * 4：如果没有编写任何构造方法，编译器会有一个默认的空构造方法
 * 5：一旦编写了至少一个构造方法，编译器将不会有默认构造方法
 * 6：构造方法也可以出现方法的重载
 *
 *
 * 一个标准的类通常由四个部分组成
 * 1：所有成员变量都要用private关键字修饰
 * 2：为每一个成员变量编写一对 Getter/Setter 方法
 * 3：编写一个无参数的构造方法
 * 4：编写一个全参数的构造方法
 * 注：编写 2、3、4 方法都可用编译器的代码生成（Alt+Insert)
 * 注：这样的标准类也叫 Java Bean
 */

public class ThisPerson {
    private String name;
    private int age;

    public void whoHello(String name){
        System.out.println(name + "，你好啊，" + "我是"  + this.name);
        System.out.println("老大不小" + age + "岁了");
    }

    //无参数构造方法
    public ThisPerson(){
        System.out.println("无参数构造方法的执行");
    }

    //全参数构造方法
    public ThisPerson(String str,int num){
        name = str;
        age = num;
    }

    public void setName(String str){
        name = str;
    }

    public String getName(){
        return name;
    }

    public void setAge(int num){
        age = num;
    }

    public int getAge(){
        return age;
    }
}
