package day2demo02;

public class Demo01Person {
    public static void main(String[] args) {
        Person people = new Person();
        people.name = "爱德华";
        //people.age = 20;
        //无法直接访问private内容，为错误写法
        //需进行简介访问
        people.setAge(20);
        people.setSex(true);
        people.show();
        System.out.println("是否是男性：" + people.isSex());
        //用成员方法 isSex 来提取出所需内容
    }
}
