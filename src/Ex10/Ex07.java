package Ex10;

/**
 * @className: Ex07
 * @author: zxb
 * @create: 2023-07-19 10:05
 */
public class Ex07 {
    public static void main(String[] args) {
        Car car=new Car(10);
        Car.Air air = car.new Air();
        air.flow();
        Car car1=new Car(41);
        Car.Air air1 = car1.getAir();
        air1.flow();
    }
}
class Car{
    private double tem;

    public Car(double tem) {
        this.tem = tem;
    }

    class Air{
        public void flow(){
            if(tem>40){
                System.out.println("吹冷气...");
            }else if(tem<0){
                System.out.println("吹暖气...");
            }else {
                System.out.println("未吹气...");
            }
        }
    }
    public Air getAir(){
        return new Air();
    }
}

