package Extends.demo06;

public class demo03Zi extends demo03Fu {

    public demo03Zi(){
        System.out.println("子类方法构造");
    }

    public demo03Zi(int num){
        super(num * 2);
        System.out.println("子类方法得数" + num);
    }
}
