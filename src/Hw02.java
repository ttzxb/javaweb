/**
 * @className: Hw02
 * @author: zxb
 * @create: 2023-07-11 08:27
 */
public class Hw02 {
    public static void main(String[] args) {
        A02 a=new A02();
        String[] strings={"zxb","liyue"};
        System.out.println(a.find("zxb",strings));
    }
}
class A02{
//    public int find(String str,char c){
//        int i=0;
//        for(i=0;i<str.length();i++){
//            if(str.charAt(i)==c){
//                break;
//            }
//        }
//        if(i==str.length()) return -1;
//        return i;
//    }
    public int find(String str,String[] strings){
        for(int i=0;i<strings.length;i++){
            if(str.equals(strings[i])){
                return i;
            }
        }
        return -1;
    }
}

