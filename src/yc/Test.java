package yc;

/**
 * @className: Test
 * @author: zxb
 * @create: 2023-07-19 11:18
 */
public class Test {

    public static void main(String[] args) {
//        int num1=10;
//        int num2=0;
//        try{
//            int res=num1/num2;
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        System.out.println("程序继续运行...");

        try {
            if(args.length!=2){
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }

            int n1=Integer.parseInt(args[0]);
            int n2=Integer.parseInt(args[1]);

            double res=cal(n1,n2);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("参数格式不正确，需要输入整数");
        }catch (ArithmeticException e){
            System.out.println("出现除零的异常");
        }
    }
    public static double cal(int n1,int n2){
        return n1/n2;
    }
}


