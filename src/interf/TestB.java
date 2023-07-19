package interf;

/**
 * @className: TestB
 * @author: zxb
 * @create: 2023-07-18 06:48
 */
public class TestB {
    public static void main(String[] args) {
        LittleMonkey littleMonkey=new LittleMonkey("wuKong");
        littleMonkey.climbing();
        littleMonkey.swim();
        littleMonkey.fly();
        System.out.println(littleMonkey.getName());
    }
}
 class Monkey{
    private String name;

     public Monkey(String name) {
         this.name = name;
     }
    public void climbing(){
        System.out.println("猴子会爬树...");
    }
     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }
 }
 interface Swimming{
    void swim();
 }
 interface Flyable{
    void fly();
 }
class LittleMonkey extends Monkey implements Swimming,Flyable{

    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("猴子学会了游泳");
    }

    @Override
    public void fly() {
        System.out.println("猴子学不会飞");

    }
}

