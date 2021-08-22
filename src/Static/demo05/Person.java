package Static.demo05;

public class Person {
    private int id; //学号
    private int age; //年龄
    private String name; //姓名
    static String room; //所在教室
    private static int idCounter = 0; //对象计数器

    public Person() {
        idCounter++;
    }

    public Person(int age, String name) {
        this.id = ++idCounter;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Person.idCounter = idCounter;
    }
}
