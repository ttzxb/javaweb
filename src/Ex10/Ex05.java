package Ex10;

/**
 * @className: Ex05
 * @author: zxb
 * @create: 2023-07-19 09:19
 */
public class Ex05 {
    public static void main(String[] args) {
        A a = new A();
        a.f1();
    }
}
class A{
    private String NAME="wjp";

    public void f1(){
        class B{//局部内部类
            private final String NAME="zxb";
            public void show(){
                System.out.println("B name="+NAME+"A name="+A.this.NAME);
            }
        }
        B b = new B();
        b.show();

    }
}
