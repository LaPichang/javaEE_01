package InnerClass.demo10;

/**
 * 内部类访问外部类同名成员变量
 * 格式：
 * 外部类名称.this.变量名
 */

public class demo02Variable {

    int num = 10;

    public class demo02Variableinner{

        int num = 20;

        public void method(){

            //内部类成员方法的局部变量
            int num3 = 30;

            System.out.println(num);
            System.out.println(this.num);
            System.out.println(demo02Variable.this.num);

        }
    }
}
