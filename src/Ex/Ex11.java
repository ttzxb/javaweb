package Ex;

/**
 * @className: Ex11
 * @author: zxb
 * @create: 2023-07-15 19:03
 */
public class Ex11 {
    public static void main(String[] args) {
        Per per= new Student();

        Student student=(Student) per;

    }
}
class Per{
    public void run(){

    }
    public void eat(){

    }
}
class Student extends Per{
    @Override
    public void run() {
        super.run();
    }
    public void study(){

    }
}

