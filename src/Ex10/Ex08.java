package Ex10;

/**
 * @className: Ex08
 * @author: zxb
 * @create: 2023-07-19 10:14
 */
public class Ex08 {
    public static void main(String[] args) {
//        Color[] colors=Color.values();
//        for(Color color:colors){
//            System.out.println(color);
//            color.show();
//        }
        Color green=Color.GREEN;
        green.show();
        switch (green){
            case GREEN:
                System.out.println("匹配到了");
                break;
            default:
                System.out.println("没有匹配到");
        }
    }
}
enum Color implements Ic{
    RED(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0);
    private double redV;
    private double greenV;
    private double blueV;

    Color(double redV, double greenV, double blueV) {
        this.redV = redV;
        this.greenV = greenV;
        this.blueV = blueV;
    }

    @Override
    public String toString() {
        return "Color{" +
                "redV=" + redV +
                ", greenV=" + greenV +
                ", blueV=" + blueV +
                '}';
    }

    @Override
    public void show() {
        System.out.println(redV+" "+greenV+" "+blueV);
    }
}
interface Ic{
    void show();
}

