package Ex;

/**
 * @className: Ex04
 * @author: zxb
 * @create: 2023-07-15 18:09
 */
public class Ex04 {
    public static void main(String[] args) {
        SubW subW=new SubW("zxb",100,30);
        Manager manager=new Manager("wjp",200,30);
        System.out.println(subW.introduceSalary());
        System.out.println(manager.introduceSalary());
    }
}
class Worker{
    private String name;
    private double singleSalary;
    private int workDay;

    public double introduceSalary(){
        return singleSalary*workDay;
    }
    public Worker(String name, double singleSalary, int workDay) {
        this.name = name;
        this.singleSalary = singleSalary;
        this.workDay = workDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSingleSalary() {
        return singleSalary*workDay;
    }

    public void setSingleSalary(double singleSalary) {
        this.singleSalary = singleSalary;
    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }
}
class Manager extends Worker{
    public Manager(String name, double singleSalary, int workDay) {
        super(name, singleSalary, workDay);
    }

    @Override
    public double introduceSalary() {
        return super.introduceSalary()*1.2+1000;
    }
}
class SubW extends Worker{
    public SubW(String name, double singleSalary, int workDay) {
        super(name, singleSalary, workDay);
    }

    @Override
    public double introduceSalary() {
        return super.introduceSalary();
    }
}

