package eNum;

/**
 * @className: Test
 * @author: zxb
 * @create: 2023-07-18 17:12
 */
public class Test {
    public static void main(String[] args) {
        //Session session=Session.WHAT;
        System.out.println(Session.AUTUMN);
        //System.out.println(session);
    }
}
enum Session{

    //在类内部直接创建固定的对象 可以再加入final修饰符
//    public final static Session SPRING=new Session("春天", "温暖");
//    public final static Session SUMMER=new Session("夏天", "炎热");
//    public final static Session AUTUMN=new Session("秋天", "凉爽");
//    public final static Session WINTER=new Session("冬天", "寒冷");
    //将构造其私有化防止直接被new
    SPRING("春天","温暖"),
    SUMMER("夏天","炎热"),
    AUTUMN("秋天","凉爽"),
    WINTER("冬天","寒冷");//,WHAT();

    private String name;
    private String desc;
    private Session(){}
    private Session(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
    //去掉set相关的方法防止属性被修改
    public String getName() {
        return name;
    }



    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Session{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

