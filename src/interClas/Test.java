package interClas;

/**
 * @className: Test
 * @author: zxb
 * @create: 2023-07-18 07:11
 */
public class Test {
    public static void main(String[] args) {
        A a=new A();
        a.m1();
        System.out.println(a.hashCode());
    }
}
class A{
    private int n1=100;
    private void m2(){
        System.out.println("m2()");
    }
    public A(){}
    public A(int n1) {
        this.n1 = n1;
    }



    public void m1(){
        //局部内部类 匿名内部类
        class D{
            private int n1=800;
            public void f1(){
                //局部内部类直接访问外部类成员

                System.out.println(n1+" "+A.this.n1);
                System.out.println(A.this.hashCode());
                //A a=new A(10);
                m2();
            }
        }
        //外部类在方法中访问内部类 创建内部类对象
        D d=new D();
        d.f1();


        class D1 extends D{

        }
        System.out.println("m1()");
    }
    {
        class D2{

        }
        System.out.println("代码块...");
    }
    //成员内部类 静态内部类
    static class B{

    }
}
class C{

}

