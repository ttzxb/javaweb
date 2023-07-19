package exercises;

/**
 * @className: Person
 * @author: zxb
 * @create: 2023-07-12 17:03
 */
public class Person {
    private String name;
    private int age;
    public String say(){
        return name+" "+age;
    }
    public Person(String name, int age) {
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
