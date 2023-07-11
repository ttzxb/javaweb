/**
 * @className: Hw07
 * @author: zxb
 * @create: 2023-07-11 10:03
 */
public class Hw07 {
    public static void main(String[] args) {
        Dog d=new Dog("zsan",18,"白色");
        d.show(d);
    }
}
class Dog{
    String name;
    int age;
    String color;
    public Dog(String name,int age,String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }
    public void show(Dog d){
        System.out.println(d.name+d.age+d.color);
    }
}

