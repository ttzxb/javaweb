package abstracts;

/**
 * @className: Abs
 * @author: zxb
 * @create: 2023-07-17 11:26
 */
public class Abs {
    public static void main(String[] args) {
        AA aa=new AA();
        BB bb=new BB();
        aa.calTime();
        bb.calTime();
    }
}
abstract class Template{
    public abstract void job();
    public void calTime(){
        long begin=System.currentTimeMillis();
        job();
        long end=System.currentTimeMillis();
        System.out.println("运行时间"+(end-begin));
    }
}
class AA extends Template{
    @Override
    public void job(){
       long sum=0;
       for(long i=1;i<=80000;i++){
           sum+=i;
       }
    }

}
class BB extends Template{
    @Override
    public void job(){
        long sum=1;
        for(long i=1;i<=8000;i++){
            sum*=i;
        }
    }
}
