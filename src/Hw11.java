/**
 * @className: Hw11
 * @author: zxb
 * @create: 2023-07-11 10:12
 */
public class Hw11 {
    public static void main(String[] args) {
        System.out.println(method(method(10.0,20.0),100));
    }
    public static double method(double n1,double n2){
        return n1+n2;
    }
    public static double method(double n1,int n2){
        return n1+n2;
    }
}


