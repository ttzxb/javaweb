package Ex10;

/**
 * @className: Ex02
 * @author: zxb
 * @create: 2023-07-19 08:52
 */
public class Ex02 {
    public static void main(String[] args) {
        Frock frock=new Frock();
        Frock frock1=new Frock();
        Frock frock2=new Frock();
        System.out.println(frock.getSerNum());
        System.out.println(frock1.getSerNum());
        System.out.println(frock2.getSerNum());
        System.out.println(frock2.getSerNum()-frock1.getSerNum()==frock1.getSerNum()-frock.getSerNum());
    }
}
class Frock{
    private static int curNum=100000;
    private int serNum;

    public int getSerNum() {
        return serNum;
    }

    public Frock() {
        serNum = getNextNum();
    }

    public int getNextNum(){
        curNum+=100;
        return curNum;
    }
}

