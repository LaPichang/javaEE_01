package Multi.demo08;

public class demo03Mouse implements demo03USB{
    @Override
    public void Open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void Shut() {
        System.out.println("关闭鼠标");
    }

    public void Use(){
        System.out.println("敲击选择");
    }
}
