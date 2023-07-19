package ploy;

/**
 * @className: Teacher
 * @author: zxb
 * @create: 2023-07-13 13:09
 */
public class Teacher extends Person{
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String say() {
        return super.say()+" "+salary;
    }
    public void teach(){
        System.out.println("老师"+getName()+"正在教java...");
    }
}

