package eNum;

/**
 * @className: TestEx
 * @author: zxb
 * @create: 2023-07-18 21:21
 */
public class TestEx {
    public static void main(String[] args) {
        Week[] week=Week.values();
        for(Week week1:week){
            System.out.println(week1);
        }
        System.out.println(week.getClass());
        Week.MONDAY.hi();
    }
}

enum Week implements A{
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),THURSDAY("星期四"),
    FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期日");
    private String name;

    private Week(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void hi() {
        System.out.println("hi....");
    }
}

interface A{
    void hi();
}


