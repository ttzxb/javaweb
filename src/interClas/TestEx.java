package interClas;

/**
 * @className: TestEx
 * @author: zxb
 * @create: 2023-07-18 09:06
 */
public class TestEx {
    public static void main(String[] args) {
        f1(new AA() {
            @Override
            public void show() {
                System.out.println("看一看...");
            }
        });
        //传统方法 硬编码
        //f1(new Car());
    }
    public static void f1(AA aa){
        aa.show();
    }
}
class Car implements AA{

    @Override
    public void show() {
        System.out.println("看一看...");
    }
}
interface AA{
    void show();
}

