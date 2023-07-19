package packetCls;

/**
 * @className: TestString
 * @author: zxb
 * @create: 2023-07-19 16:08
 */
public class TestString {
    public static void main(String[] args) {
        Integer i=100;
        String ss=i+"";
        String str1=i.toString();
        String s = String.valueOf(i);

        //String->Integer
        String s1="123456";
        Integer i1=Integer.parseInt(s1);
        Integer i2=new Integer(s1);
        System.out.println("ok...");
    }
}

