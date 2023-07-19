package interClas;

/**
 * @className: TestN
 * @author: zxb
 * @create: 2023-07-18 08:31
 匿名内部类
 */
public class TestN {
    public static void main(String[] args) {
        Outer outer=new Outer();
        outer.method();
    }
}
interface A_{
    public void cry();
}
class Outer{
    private int n1=10;
    public void method(){
        //基于接口的匿名内部类
        A_ tiger=new A_(){
            @Override
            public void cry() {
                System.out.println("老虎叫...");
            }
        };
        System.out.println(tiger.getClass());
        tiger.cry();
//        A_ tiger=new Tiger();
//        tiger.cry();
        //基于类的匿名内部类
        Father father1=new Father("zxb");
        Father father=new Father("jack"){

            @Override
            public void test() {
                System.out.println("匿名内部类重写了test()方法");
            }
        };
        System.out.println(father1.getClass());
        System.out.println(father.getClass());
        father.test();
        //基于抽象类的匿名内部类
        Animal animal=new Animal(){
            @Override
            void eat() {
                System.out.println("小狗吃骨头...");
            }
        };
        System.out.println(animal.getClass());
        animal.eat();
    }
}
//class Tiger implements A_{
//
//    @Override
//    public void cry() {
//        System.out.println("老虎叫...");
//    }
//}
class Father{
    private String name;
    public Father(String name){
        System.out.println("name="+name);
    }
    public void test(){

    }
}
abstract class Animal{
    abstract void eat();
}
