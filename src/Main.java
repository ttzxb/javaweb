/**
 * @className: Main
 * @author: zxb
 * @create: 2023-07-07 20:38
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello,World!!");
        Person p=new Person();
        p.name="jack";
        p.age=10;
        MyTools myTools=new MyTools();
        Person p2=myTools.copyPerson(p);
        System.out.println(p.name+p.age);
        System.out.println(p2.name+p2.age);
        System.out.println(p==p2);
    }
}
class Person{
    String name;
    int age;
}
class MyTools{
    public Person copyPerson(Person p){
        Person p2=new Person();
        p2.name=p.name;
        p2.age=p.age;
        return p2;
    }
}

