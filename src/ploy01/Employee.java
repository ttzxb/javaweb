package ploy01;

/**
 * @className: Employee
 * @author: zxb
 * @create: 2023-07-13 15:01
 */
public class Employee {
    private String name;
    private double salary;
    public double getAnnual(){
        return 12*salary;
    }
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
