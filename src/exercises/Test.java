package exercises;

/**
 * @className: Test
 * @author: zxb
 * @create: 2023-07-12 17:07
 */
public class Test {
    public static void main(String[] args) {
        Person p=new Person("we",18);
        System.out.println(p.say());
        Student s=new Student("zxb",18,"202120901105",100);
        System.out.println(s.say());
    }
}

