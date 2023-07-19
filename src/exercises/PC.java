package exercises;

/**
 * @className: PC
 * @author: zxb
 * @create: 2023-07-12 11:52
 */
public class PC extends Computer{
    private String brand;

    public PC(String cpu, int nc, int disk, String brand) {
        super(cpu, nc, disk);
        this.brand = brand;
    }
    public void printInfo(){
        System.out.println(getDetails()+" "+brand);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

