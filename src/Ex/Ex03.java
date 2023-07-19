package Ex;

/**
 * @className: Ex03
 * @author: zxb
 * @create: 2023-07-13 21:18
 */
public class Ex03 {
    public static void main(String[] args) {
        Teacher teacher=new P("zxb",18,"经理",10000);
        //System.out.println(t.introduce());
        P p=(P) teacher;
        System.out.println(p.introduce());
    }
}
class Teacher{
    private String name;
    private int age;
    private String pos;
    private double salary;

    public Teacher(String name, int age, String pos, double salary) {
        this.name = name;
        this.age = age;
        this.pos = pos;
        this.salary = salary;
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

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String introduce(){
        return name+age+pos+salary;
    }
}
class P extends Teacher{
    public P(String name, int age, String pos, double salary) {
        super(name, age, pos, salary);
    }

    @Override
    public String introduce() {
        setSalary(1.3);
        return super.introduce();
    }
}
class SubP extends Teacher{
    public SubP(String name, int age, String pos, double salary) {
        super(name, age, pos, salary);
    }

    @Override
    public String introduce() {
        return super.introduce();
    }
}
class Lecturer extends Teacher{
    public Lecturer(String name, int age, String pos, double salary) {
        super(name, age, pos, salary);
    }

    @Override
    public String introduce() {
        return super.introduce();
    }
}

