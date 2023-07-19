package exercises;

/**
 * @className: NotePad
 * @author: zxb
 * @create: 2023-07-12 12:01
 */
public class NotePad extends Computer{
    private String color;

    public NotePad(String cpu, int nc, int disk, String color) {
        super(cpu, nc, disk);
        this.color = color;
    }
    public void printInfo(){
        System.out.println(getDetails()+" "+color);
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

