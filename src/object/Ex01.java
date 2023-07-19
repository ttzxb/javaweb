package object;

/**
 * @className: Ex01
 * @author: zxb
 * @create: 2023-07-13 16:39
 */
public class Ex01 {
    public static void main(String[] args) {
        Person p1=new Person("jack",18,'男');
        Person p2=new Person("zxb",18,'男');

        System.out.println(p1.equals(p2));
    }
}
class Person{
    private  String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) {
            return true;
        }else if(obj instanceof Person){
            Person p=(Person) obj;//向下转型 得到obj的各个属性
            return this.name.equals(p.name)&&this.age==p.age&&this.gender==p.gender;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

