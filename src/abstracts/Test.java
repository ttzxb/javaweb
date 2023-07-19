package abstracts;
/**
 * @className: Test
 * @author: zxb
 * @create: 2023-07-17 10:55
 */
public class Test {
    public static void main(String[] args) {
        Ce ce=new Ce("zxb","202120901105",1.2);
        Manager manager=new Manager("wjp","202120901145",1.5,1.0);
        ce.work();
        manager.work();
    }
}
abstract class Employee{
    private String name;
    private String id;
    private double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();
}
class Ce extends Employee{


    public Ce(String name, String id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工"+getName()+"正在工作...");
    }
}
class Manager extends Employee{

    private double bonus;

    public Manager(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理"+getName()+"正在工作...");
    }
}

