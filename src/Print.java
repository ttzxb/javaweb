/**
 * @className: Print
 * @author: zxb
 * @create: 2023-07-09 21:07
 */
public class Print {
    public static void main(String[] args) {
        D d=new D();
        int n=10;
        d.print(n);
    }
}
class D{
    public void print(int n){
        if(n>1){
            print(n-1);
        }
        System.out.print(n+" ");
    }
}

