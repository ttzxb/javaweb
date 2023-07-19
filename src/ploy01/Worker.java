package ploy01;

/**
 * @className: Worker
 * @author: zxb
 * @create: 2023-07-13 15:00
 */
public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
    public void work(){
        System.out.println("工人"+getName()+"正在工作!");
    }
}

