package interClas;

/**
 * @className: MemberInnerCls
 * @author: zxb
 * @create: 2023-07-18 11:27
 */
public class MemberInnerCls {
    public static void main(String[] args) {
        Outer_M outer_m=new Outer_M();
        outer_m.t1();
        //外部其他类使用成员内部类
        //三种方式 1.
        Outer_M.Inner inner = outer_m.new Inner();
        //2.在外部类中，比那些一个方法，可以返回Inner对象
        Outer_M.Inner innerInstance = outer_m.getInnerInstance();
        innerInstance.say();
        //3.
        //new Outer_M().new Inner();
    }
}
class Outer_M{
    private int n1=10;
    public String name="zxb";
    private void hi(){
        System.out.println("hi...");
    }
    class Inner{
        private double sal=9.9;
        private int n1=66;
        public void say(){
            hi();
            //如果成员内部类的成员和外部类重名了，会遵循就近原则
            System.out.println(n1+" "+Outer_M.this.n1+" "+name);
        }
    }
    public Inner getInnerInstance(){
        return new Inner();
    }
    public void t1(){
        //外部类使用成员内部类
        //穿件成员内部类得对象，使用相关的方法
        Inner inner = new Inner();
        inner.say();
        System.out.println(inner.sal);
    }
}


