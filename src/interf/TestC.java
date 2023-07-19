package interf;

/**
 * @className: TestC
 * @author: zxb
 * @create: 2023-07-18 06:56
 */
public class TestC {
    public static void main(String[] args) {
        A a=new C();
        B b=new C();
    }
}
interface A{
    void hi();
}
interface B extends A{

}
class C implements B{

    @Override
    public void hi() {

    }
}

