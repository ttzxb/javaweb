package single;

/**
 * @className: SingleTon
 * @author: zxb
 * @create: 2023-07-16 16:19
 */
public class SingleTon {
    public static void main(String[] args) {
        GirlFriend gf1=GirlFriend.getInstance();
        System.out.println(gf1);
        GirlFriend gf2=GirlFriend.getInstance();
        System.out.println(gf2);
        System.out.println(gf1==gf2);
    }
}
class GirlFriend{
    private String name;
    private static GirlFriend gf=new GirlFriend("小美");
    private GirlFriend(String name) {
        this.name = name;
    }
    public static GirlFriend getInstance(){
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}

