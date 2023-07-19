package Ex10;

/**
 * @className: Ex06
 * @author: zxb
 * @create: 2023-07-19 09:32
 */
public class Ex06 {
    public static void main(String[] args) {
        Person ts=new Person("唐僧",VeFac.getH());
        ts.common();
        ts.passRiver();
        ts.common();
        ts.passM();
    }
}
interface Vehicles{
    void work();
}
class Horse implements Vehicles{

    @Override
    public void work() {
        System.out.println("骑马...");
    }
}
class Boat implements Vehicles{

    @Override
    public void work() {
        System.out.println("用船...");
    }
}
class Plane implements Vehicles{

    @Override
    public void work() {
        System.out.println("开飞机...");
    }
}
class Person{
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    public void passRiver(){
        //先得到船
//        Boat b = VeFac.getB();
//        b.work();
        if(!(vehicles instanceof Boat)){
            vehicles=VeFac.getB();
        }
        vehicles.work();
    }
    public void common(){
//        Horse h = VeFac.getH();
//        h.work();
        if(!(vehicles instanceof Horse)){
            vehicles=VeFac.getH();
        }
        vehicles.work();
    }
    public void passM(){
        if(!(vehicles instanceof Plane)){
            vehicles=VeFac.getP();
        }
        vehicles.work();
    }
}
class VeFac{
    private static Horse horse=new Horse();
    private static Plane plane=new Plane();
    private VeFac(){}
    public static Horse getH(){//马儿是同一批马
        //return new Horse();
        return horse;
    }
    public static Boat getB(){
        return new Boat();
    }
    public static Plane getP(){
        return plane;
    }
}
