package Ex;

import java.util.Arrays;
//访问修饰符
/*
    public 本类 跨类 子类 跨包
    protected 本类 跨类 子类
    default 本类 跨类
    private 本类
 */

/**
 * @className: Ex01
 * @author: zxb
 * @create: 2023-07-13 20:58
 */
public class Ex01 {
    public static void main(String[] args) {
       Person[] p=new Person[3];
       p[0]=new Person("jack",18,"打灰");
       p[1]=new Person("zxb",19,"打灰");
       p[2]=new Person("wjp",20,"打灰");

        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }
        Person tmp=null;
        for(int i=0;i<p.length;i++){
            for(int j=0;j<p.length-1-i;j++){
                if(p[j].getAge()<p[j+1].getAge()){
                    tmp=p[j];
                    p[j]=p[j+1];
                    p[j+1]=tmp;
                }
            }
        }
        System.out.println("======排序后结果======");
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }
    }


}
class Person{
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}

