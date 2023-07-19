package interClas;

/**
 * @className: StaticInnerCls
 * @author: zxb
 * @create: 2023-07-18 11:49
 */
public class StaticInnerCls {
    public static void main(String[] args) {
        S_Ouster s_ouster = new S_Ouster();
        s_ouster.m1();
        //外部其它类访问内部类
        //1.
        S_Ouster.S_Inner s_inner = new S_Ouster.S_Inner();
        s_inner.say();
        //2.
        S_Ouster.S_Inner instance = s_ouster.getInstance();
        instance.say();

        S_Ouster.S_Inner instance_ = S_Ouster.getInstance_();
        instance_.say();

    }
}
class S_Ouster{
    private int n1=10;
    private static String name="zxb";
    private static void cry(){}
    public static class S_Inner{
        private static String name="wjp";
        public void say(){
            System.out.println(name+" "+S_Ouster.name);
            cry();
        }
    }
    public S_Inner getInstance(){
        return new S_Inner();
    }
    public static S_Inner getInstance_(){
        return new S_Inner();
    }
    public void m1(){//创建对象 外部类访问内部类
        S_Inner s_inner=new S_Inner();
        s_inner.say();
    }
}

