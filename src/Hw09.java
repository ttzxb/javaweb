/**
 * @className: Hw09
 * @author: zxb
 * @create: 2023-07-11 10:08
 */
public class Hw09 {
    public static void main(String[] args) {
        Music m=new Music("逆战",2.43);
        m.play();
        m.getInfo();
    }
}
class Music{
    String name;
    double times;
    public Music(String name,double times){
        this.name=name;
        this.times=times;
    }
    public void play(){
        System.out.println("音乐开始播放！");
    }
    public void getInfo(){
        System.out.println(this.name+this.times);
    }
}

