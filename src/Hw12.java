/**
 * @className: Hw12
 * @author: zxb
 * @create: 2023-07-11 10:18
 */
public class Hw12 {
    public static void main(String[] args) {
        Emp e1=new Emp("zs","男",18);
        Emp e2=new Emp("程序员",15000);
        Emp e3=new Emp("zs","男",18,"程序员",15000);
        System.out.println(e1.name+e1.sex+e1.age+e1.pos+e1.salary);
        System.out.println(e2.name+e2.sex+e2.age+e2.pos+e2.salary);
        System.out.println(e3.name+e3.sex+e3.age+e3.pos+e3.salary);
    }
}
class Emp{
    String name;
    String sex;
    int age;
    String pos;
    double salary;
    public Emp(String name,String sex,int age){
        this.name=name;
        this.sex=sex;
        this.age=age;
    }
    public Emp(String pos,double salary){
        this.pos=pos;
        this.salary=salary;
    }
    public Emp(String name,String sex,int age,String pos,double salary){
        this(name,sex,age);
        this.pos=pos;
        this.salary=salary;
    }
}

