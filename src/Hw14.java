import java.util.Random;

/**
 * @className: Hw14
 * @author: zxb
 * @create: 2023-07-11 10:38
 */
public class Hw14 {
    public static void main(String[] args) {
        Computer c=new Computer();
        P p=new P();
        Judge j=new Judge();
        System.out.println("电脑====玩家====本场情况");
        for(int i=0;i<10&&p.count<3;i++){
            Random r=new Random();
            c.random=r.nextInt(3);
            p.num=r.nextInt(3);
            int res=j.judge(c,p);
            p.getPlayerWin(res);
            p.count++;
            System.out.println("====================");
            System.out.print(c.random+"\t\t"+p.num+"\t\t");
            if(res==-1){
                System.out.println("电脑赢");
            }else if(res==1){
                System.out.println("玩家赢");
            }else {
                System.out.println("平局");
            }
            System.out.println("====================");
            //System.out.println(j.judge(c,p));
            //System.out.println(j.judge(c,p));
        }
    }
}
class Computer{
    int random;
}
class P{
    int num;
    int playerWin=0;
    int count=0;
    public int getPlayerWin(int res){
        if(res==1){
            playerWin++;
        }
        return playerWin;
    }
}
class Judge{
    public int judge(Computer c,P p){
        if(c.random-p.num==2||c.random-p.num==-1) return -1;
        else if(p.num-c.random==2||p.num-c.random==-1) return 1;
        return 0;
    }
}
