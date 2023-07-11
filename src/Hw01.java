/**
 * @className: Hw01
 * @author: zxb
 * @create: 2023-07-11 08:23
 */
public class Hw01 {
    public static void main(String[] args) {
        A01 a=new A01();
        double[] n={1.2,1.4,9.8,114.514};
        System.out.println(a.getMax(n));
    }
}
class A01{
    public double getMax(double[] n){
        double max=-0x3f3f3f3f;
        for(int i=0;i<n.length;i++){
            if(max<n[i]){
                max=n[i];
            }
        }
        return max;
    }
}

