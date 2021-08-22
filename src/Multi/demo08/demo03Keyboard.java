package Multi.demo08;

public class demo03Keyboard implements demo03USB{
    @Override
    public void Open() {
        System.out.println("打开键盘");
    }

    @Override
    public void Shut() {
        System.out.println("关闭键盘");
    }

    public void Use(){
        System.out.println("键入数据");
    }
}
