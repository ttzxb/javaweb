/**
 * @className: Factorial
 * @author: zxb
 * @create: 2023-07-09 20:57
 */
public class Factorial {
    public static void main(String[] args) {
        B b=new B();
        int n=5;
        int res=b.factorial(n);
        if(res!=-1){
            System.out.println(n+"的阶乘为"+res);
        }

    }
}
class B{
    public int factorial(int n){
        if(n>=0){
            if(n==1){
                return 1;
            }else {
                return factorial(n-1)*n;
            }
        }else {
            System.out.println("负数没有阶乘!");
            return -1;
        }
    }
}

