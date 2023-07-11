/**
 * @className: Test
 * @author: zxb
 * @create: 2023-07-07 20:52
 */
public class Test {
    public static void main(String[] args) {
        int n=0;
        AA a=new AA();
        if(a.isOdd(n)){
            System.out.println(n+"是奇数");
        }else System.out.println(n+"是偶数");
        a.print(10,10,'@');
    }
}
class AA{
    public void judge(int n) {
        if (n % 2==0) System.out.println(n+"为偶数");
        else System.out.println(n+"为奇数");
    }
    public boolean isOdd(int n){
//        if(n%2!=0) return true;
//        else return false;
        return n%2!=0;
    }
    public void print(int row,int col,char c){
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}

