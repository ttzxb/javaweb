package ploy01;

/**
 * @className: Ploy002
 * @author: zxb
 * @create: 2023-07-13 15:07
 */
public class Ploy002 {
    public static void main(String[] args) {
        Worker tom=new Worker("tom",2500);
        Manager zxb=new Manager("zxb",10000,100000);
        Ploy002 ploy002=new Ploy002();
        ploy002.showEmpAnnual(tom);
        ploy002.showEmpAnnual(zxb);

        ploy002.testEmp(tom);
        ploy002.testEmp(zxb);
    }
    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());
    }
    public void testEmp(Employee e){
        if(e instanceof Worker){
            ((Worker) e).work();
        }else if(e instanceof Manager){
            ((Manager) e).manage();
        }else {
            System.out.println("不做处理...");
        }
    }
}

