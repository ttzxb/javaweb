/**
 * @className: Hw13
 * @author: zxb
 * @create: 2023-07-11 10:26
 */
public class Hw13 {
    public static void main(String[] args) {
        Cir c=new Cir();
        PassAreas p=new PassAreas();
        p.printAreas(c,5);
    }
}
class Cir{
    double radius;
    public double findArea(){
        return radius*radius*Math.PI;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
}
class PassAreas{
    public void printAreas(Cir c,int times){
        System.out.println("Radius"+"\t"+"Area");
        for(int i=1;i<times;i++){
            c.setRadius(i);
            System.out.println(i+"\t"+c.findArea());
        }
    }
}
