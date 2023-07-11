/**
 * @className: This
 * @author: zxb
 * @create: 2023-07-11 08:10
 */
public class This {
    public static void main(String[] args) {
        Per p1=new Per("张三",18);
        Per p2=new Per("张三",18);
        System.out.println(p1.equals(p2));
        System.out.println(p1.compareTo(p2));
    }
}
class Per{
    String name;
    int age;
    public Per(String name,int age){
        this.name=name;
        this.age=age;
    }
    public boolean compareTo(Per p){
        if(this.name.equals(p.name)&&this.age==p.age){
            return true;
        }return false;
    }
}


