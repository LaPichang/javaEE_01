package Interface.demo07;

public class demo02faceAbstrctB implements demo02default{
    @Override
    public void methodAbs() {
        System.out.println("抽象方法实现B");
    }

    @Override
    public void methodDefault() {
        System.out.println("默认方法重构B");
    }
}
