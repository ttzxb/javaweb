package exercises;

/**
 * @className: Computer
 * @author: zxb
 * @create: 2023-07-12 11:52
 */
public class Computer {
    private String cpu;
    private int nc;
    private int disk;
    public String getDetails(){
        return cpu+" "+nc+" "+disk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getNc() {
        return nc;
    }

    public void setNc(int nc) {
        this.nc = nc;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    public Computer(String cpu, int nc, int disk) {
        this.cpu = cpu;
        this.nc = nc;
        this.disk = disk;
    }
}

