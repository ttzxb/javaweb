package Ex;

/**
 * @className: Ex09
 * @author: zxb
 * @create: 2023-07-15 18:50
 */
public class Ex09 {
    public static void main(String[] args) {
        Label label=new Label("Tur",100,100);
    }
}
class Point{
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
class Label extends Point{
    private String date;

    public Label(String date,double x, double y) {
        super(x, y);
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
