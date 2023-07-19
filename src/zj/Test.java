package zj;
@SuppressWarnings({"unused","unchecked","rawtypes"})
/**
 * @className: Test
 * @author: zxb
 * @create: 2023-07-18 22:04
 */

public class Test {
    //@SuppressWarnings("unused")//i 作用范围和放置的位置有关 现在抑制警告范围在main里
    public static void main(String[] args) {
        int i;
        A a=new A();
        a.say();
    }
}
@Deprecated
class A{
    int i;
    @Deprecated
    public void say(){
        System.out.println("say...");
    }
}
class B extends A{
    @Override
    public void say() {
        super.say();
    }
}
