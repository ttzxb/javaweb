/**
 * @className: Hw05
 * @author: zxb
 * @create: 2023-07-11 09:51
 */
public class Hw05 {
    public static void main(String[] args) {
        Circle c=new Circle();
        System.out.println(c.getZc(1));
        System.out.println(c.getMj(1));

    }
}
class Circle{
    double bj;
    public double getZc(double bj){
        return 2*3.14*bj;
    }
    public double getMj(double bj){
        return 3.14*bj*bj;
    }
}

