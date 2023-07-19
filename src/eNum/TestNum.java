package eNum;

/**
 * @className: TestNum
 * @author: zxb
 * @create: 2023-07-18 17:34
 */
public class TestNum {
    public static void main(String[] args) {
        Session autumn=Session.AUTUMN;
        
        System.out.println(autumn);
        
        System.out.println(autumn.name());
        
        System.out.println(autumn.ordinal());
        
        Session[] values = Session.values();
        for(Session session:values){
            System.out.println(session);
        }

        Session session = Session.valueOf("AUTUMN");
        System.out.println(session);

        System.out.println(session.getClass());
        //System.out.println(session.toString());
        System.out.println(session==autumn);

        System.out.println(Session.AUTUMN.compareTo(Session.AUTUMN));
        System.out.println(session.compareTo(autumn));
        System.out.println(Session.WINTER.compareTo(Session.SPRING));



    }
}

