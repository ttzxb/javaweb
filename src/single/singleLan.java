package single;

/**
 * @className: singleLan
 * @author: zxb
 * @create: 2023-07-16 16:42
 */
public class singleLan {
    public static void main(String[] args) {
        Cat cat1=Cat.getInstance();
        System.out.println(cat1);
        Cat cat2=Cat.getInstance();
        System.out.println(cat2);
        System.out.println(cat1==cat2);
    }
}
class Cat{
    private String name;
    private static Cat cat=null;
    private Cat(String name) {
        this.name = name;
    }
    public static Cat getInstance(){
        if(cat==null){
            cat=new Cat("小可爱");
        }
        return cat;
    }
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}

