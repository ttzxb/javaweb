package Final;

/**
 * @className: Circle
 * @author: zxb
 * @create: 2023-07-17 09:54
 */
public class Test {
    public static void main(String[] args) {
        Circle c=new Circle(10);
        System.out.println(c.getArea());
    }
}
class Circle{
    private double radius;
    private final  double PI;//=3.14;

    public Circle(double radius) {
        this.radius = radius;
        //PI=3.14;
    }
    {
        PI=3.14;
    }
    public double getArea(){
        return PI*radius*radius;
    }
}

