/**
 * @className: Fibonacci
 * @author: zxb
 * @create: 2023-07-09 20:51
 */
public class Fibonacci {
    public static void main(String[] args) {
        A a=new A();
        int n=7;
        int res=a.fibonacci(n);
        if(res!=-1){
            System.out.println(n+"的斐波那契数为"+res);
        }
    }
}
class A{
    public int fibonacci(int n){
        if(n>=1){
            if(n==1||n==2){
                return 1;
            }else {
                return fibonacci(n-1)+fibonacci(n-2);
            }
        }else {
            System.out.println("输入的n值应大于等于1");
            return -1;
        }
    }
}

