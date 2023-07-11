/**
 * @className: Peach
 * @author: zxb
 * @create: 2023-07-09 21:02
 */
public class Peach {
    public static void main(String[] args) {
        int day=8;
        C c=new C();
        int res=c.peach(day);
        if(res!=-1){
            System.out.println("第"+day+"天的桃子数为"+res);
        }
    }
}
class C{
    public int peach(int day){
        if(day==10){
            return 1;
        }else if(day>=1&&day<=9){
            return (peach(day+1)+1)*2;
        }else {
            System.out.println("请输入大于0的天数!");
            return -1;
        }
    }
}

