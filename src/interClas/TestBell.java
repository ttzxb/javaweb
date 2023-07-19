package interClas;

/**
 * @className: TestBell
 * @author: zxb
 * @create: 2023-07-18 11:08
 */
public class TestBell {
    public static void main(String[] args) {
        CellPhone cellPhone=new CellPhone();
        System.out.println(cellPhone.getClass());
        cellPhone.alarm_clock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了...");
            }
        });
        cellPhone.alarm_clock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了...");
            }
        });
    }

}
interface Bell{
    void ring();
}
class CellPhone{
    public void alarm_clock(Bell bell){
        System.out.println(bell.getClass());
        bell.ring();
    }
}

