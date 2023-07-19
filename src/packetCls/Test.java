package packetCls;

import java.sql.Wrapper;

/**
 * @className: Test
 * @author: zxb
 * @create: 2023-07-19 15:50
 */
public class Test {
    public static void main(String[] args) {
        int n1=100;
        //手动装箱
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);
        //手动拆箱
        int i=integer.intValue();

        int n2=200;
        //自动装箱
        Integer integer2=n2;
        //自动拆箱
        int n3=integer2;
    }
}

