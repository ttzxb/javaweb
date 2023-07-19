package Ex;

import javax.print.Doc;

/**
 * @className: Ex10
 * @author: zxb
 * @create: 2023-07-15 18:54
 */
public class Ex10 {
    public static void main(String[] args) {
        Doctor doctor1=new Doctor("zxb",18);
        Doctor doctor2=new Doctor("zxb",18);
        System.out.println(doctor1.equals(doctor2));
    }
}
class Doctor{
    private String name;
    private int age;

    @Override
    public boolean equals(Object obj) {
        Doctor doctor=(Doctor) obj;
        return this.age==doctor.age&&this.name.equals(doctor.name);
    }

    public Doctor(String name, int age) {
        this.name = name;
        this.age = age;
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
}

