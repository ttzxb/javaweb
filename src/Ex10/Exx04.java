package Ex10;

/**
 * @className: Exx04
 * @author: zxb
 * @create: 2023-07-19 09:06
 */
public class Exx04 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.testWork(new Usb() {
            @Override
            public void work() {
                System.out.println("计算中...");
            }
        });
    }
}
interface Usb{
    void work();
}
class CellPhone{
    public void testWork(Usb usb){
        usb.work();//动态绑定
        System.out.println("完成计算...");
    }
}

