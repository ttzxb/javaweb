package interf;

/**
 * @className: TestA
 * @author: zxb
 * @create: 2023-07-18 06:43
 */
public class TestA {
    public static void main(String[] args) {
        Phone_ phone=new Phone_();
        Camera_ camera=new Camera_();
        Computer computer=new Computer();
        computer.work(phone);
        computer.work(camera);
    }
}
interface Usb_{
    void start();
    void stop();
}
class Computer{
    public void work(Usb_ usb_){
        usb_.start();
        usb_.stop();
    }
}
class Phone_ implements Usb_{

    @Override
    public void start() {
        System.out.println("手机正在工作");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作");
    }
}
class Camera_ implements Usb_{

    @Override
    public void start() {
        System.out.println("相机正在工作");
    }

    @Override
    public void stop() {
        System.out.println("相机停止工作");
    }
}

