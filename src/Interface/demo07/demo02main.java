package Interface.demo07;

public class demo02main {

    public static void main(String[] args) {

        demo02faceAbstrctA faceA = new demo02faceAbstrctA();
        demo02faceAbstrctB faceB = new demo02faceAbstrctB();
        faceA.methodAbs();
        faceA.methodDefault(); //实现类未覆盖重现默认方法
        System.out.println("---------------------");
        faceB.methodAbs();
        faceB.methodDefault(); //实现类覆盖了默认方法从而成了新的方法
    }
}
