package InnerClass.demo10;

public class demo01main {

    public static void main(String[] args) {

        demo01 body = new demo01();
        body.Lookoutinner();

        System.out.println("-----------------");

        demo01.demo01InnerClass face = new demo01().new demo01InnerClass();
        face.methodInner();
    }
}
