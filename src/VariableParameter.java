/**
 * @className: VariableParameter
 * @author: zxb
 * @create: 2023-07-10 16:11
 */
public class VariableParameter {
    public static void main(String[] args) {
        E e=new E();
        System.out.println(e.variableParameter("zxb",100,100));
    }
}
class E{
    public String variableParameter(String name,double... score){
        int totalScore=0;
        for(int i=0;i<score.length;i++){
            totalScore+=score[i];
        }
        return name+totalScore;
    }
}

