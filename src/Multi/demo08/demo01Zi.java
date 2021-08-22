package Multi.demo08;

public class  demo01Zi extends demo01Fu{

    int num = 20;

    @Override
    public void method() {
        System.out.println(num);
    }

    public void methodZi(){
        System.out.println("子类专属成员方法");
    }
}
