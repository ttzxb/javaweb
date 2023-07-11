/**
 * @className: Hw03
 * @author: zxb
 * @create: 2023-07-11 09:35
 */
public class Hw03 {
    public static void main(String[] args) {
        Book b=new Book();
        System.out.println(b.updatePrice(46));
    }
}
class Book{
    public int updatePrice(int price){
        if(price>150){
            price=150;
            return price;
        }if(price>100){
            price=100;
            return price;
        }return price;
    }
}

