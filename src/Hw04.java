import java.lang.reflect.Array;

/**
 * @className: Hw04
 * @author: zxb
 * @create: 2023-07-11 09:38
 */
public class Hw04 {
    public static void main(String[] args) {
        A03 a=new A03();
        int[] arr={1,2,3};
        int[] newArr=a.copyArr(arr);
        for(int i=0;i<newArr.length;i++){
            System.out.println(newArr[i]);
        }
    }
}
class A03{
    int[] arr1=new int[3];
    public int[] copyArr(int[] arr){
        int[] newArr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            newArr[i]=arr[i];
        }
        return newArr;
    }
}

