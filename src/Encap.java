import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * @className: Encap
 * @author: zxb
 * @create: 2023-07-11 20:14
 */
public class Encap {
    public static void main(String[] args) {
        P1 p=new P1();
        p.setName("zxb");
        p.setAge(18);
        p.setSalary(10000);
        p.info();
        System.out.println(p.getSalary());
        P1 smith = new P1("smithaa", 1800, 100000);
        smith.info();
    }
}

class P1{
    public String name;
    private int age;
    public P1(){}
    public P1(String name,int age,double salary){
        setName(name);
        setAge(age);
        setSalary(salary);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>=2&&name.length()<=6){
            this.name=name;
        }else {
            this.name="佚名";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=0&&age<=120){
            this.age=age;
        }else{
            this.age=18;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private double salary;
    public void info(){
        System.out.println(name+age+salary);
    }
}

