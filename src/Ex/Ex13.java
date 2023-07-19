package Ex;

/**
 * @className: Ex13
 * @author: zxb
 * @create: 2023-07-15 19:14
 */
public class Ex13 {
    public static void main(String[] args) {
        Pe[] pes=new Pe[4];
        pes[0]=new Ter("zxb",48,'男',10);
        pes[1]=new Ter("zx",58,'男',10);
        pes[2]=new Stu("z",18,'男',"202120901145");
        pes[3]=new Stu("z1",19,'男',"202120901105");
        Pe tmp=null;
        for(int i=0;i<pes.length-1;i++){
            for(int j=0;j< pes.length-1-i;j++){
                if(pes[j].getAge()<pes[j+1].getAge()){
                    tmp=pes[j];
                    pes[j]=pes[j+1];
                    pes[j+1]=tmp;
                }
            }
        }
        for(int i=0;i<pes.length;i++){
//            if(pes[i] instanceof Ter){
//                pes[i].introduce();
//            }else if(pes[i] instanceof Stu){
//                pes[i].introduce();
//            }
            pes[i].introduce();
            System.out.println("=============");
        }
//        Pe pe=new Pe("zxb",18,'男');
//        Pe pe1=new Stu("zxb",18,'男',"202120901105");
//        Pe pe2=new Ter("wjp",18,'男',10);
    }
}
class Pe{
    private String name;
    private int age;
    private char gender;



    public Pe(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    public void introduce(){
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
        System.out.println("性别："+gender);
    }
    public void play(){

    }

    @Override
    public String toString() {
        return age+" ";
    }
}
class Stu extends Pe{
    private String id;

    public Stu(String name, int age, char gender, String id) {
        super(name, age, gender);
        this.id = id;
    }
    public void study(){
        System.out.println(getName()+"好好学习");
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void play() {
        System.out.println(getName()+"喜欢踢足球");
    }

    @Override
    public void introduce() {
        System.out.println("学生的信息：");
        super.introduce();
        System.out.println("学号："+id);
        study();
        play();
    }

}
class Ter extends Pe{
    private int workY;

    @Override
    public void introduce() {
        System.out.println("老师的信息：");
        super.introduce();
        System.out.println("教龄："+workY);
        teach();
        play();
    }
    public void teach(){
        System.out.println(getName()+"好好教课");
    }

    @Override
    public void play() {
        System.out.println(getName()+"喜欢下围棋");
    }

    public Ter(String name, int age, char gender, int workY) {
        super(name, age, gender);
        this.workY = workY;
    }

    public int getWorkY() {
        return workY;
    }

    public void setWorkY(int workY) {
        this.workY = workY;
    }

}


