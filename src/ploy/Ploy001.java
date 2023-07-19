package ploy;

/**
 * @className: Ploy001
 * @author: zxb
 * @create: 2023-07-13 13:13
 */
public class Ploy001 {
    public static void main(String[] args) {
        Person[] p=new Person[5];
        p[0]=new Person("jack",18);
        p[1]=new Student("zxb",18,100);
        p[2]=new Student("wjp",18,100);
        p[3]=new Teacher("lsl",50,20000);
        p[4]=new Teacher("ly",20,10000);
        for(int i=0;i<p.length;i++){
            if(p[i] instanceof Student){
                Student student=(Student) p[i];
                student.study();
            }else if(p[i] instanceof Teacher){
                Teacher teacher=(Teacher) p[i];
                teacher.teach();
            }else if(p[i] instanceof Person){

            }else {
                System.out.println("执行类型有误...");
            }
            System.out.println(p[i].say());
        }
    }
}

