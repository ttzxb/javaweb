/**
 * @className: Hw06
 * @author: zxb
 * @create: 2023-07-11 09:54
 */
public class Hw06 {
    public static void main(String[] args) {
        Cal c=new Cal(1.2,0);
        System.out.println(c.jia(c.n1, c.n2));
        System.out.println(c.jian(c.n1, c.n2));
        System.out.println(c.cheng(c.n1, c.n2));
        System.out.println(c.chu(c.n1, c.n2));
    }
}
class Cal{
    double n1,n2;
    public Cal(double n1,double n2){
        this.n1=n1;
        this.n2=n2;
    }
    public double jia(double n1,double n2){
        return n1+n2;
    }
    public double jian(double n1,double n2){
        if(n1>=n2) return n1-n2;
        else return n2-n1;
    }
    public double cheng(double n1,double n2){
        return n1*n2;
    }
    public double chu(double n1,double n2){
        if(n2!=0) return n1/n2;
        else{
            System.out.println("n2除数不可为0!");
            return -1;
        }
    }
}

