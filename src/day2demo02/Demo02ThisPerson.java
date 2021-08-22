package day2demo02;

public class Demo02ThisPerson {
    public static void main(String[] args) {
        ThisPerson people = new ThisPerson();//无参构造
        System.out.println("--------------------------------------");
        ThisPerson man = new ThisPerson("王德发",38);//全参构造
        people.setName("郭德纲");
        people.setAge(18);
        people.whoHello("岳云鹏");
        System.out.println("--------------------------------------");
        man.whoHello("李狗栓");
    }
}
