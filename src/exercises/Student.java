package exercises;

/**
 * @className: Student
 * @author: zxb
 * @create: 2023-07-12 17:03
 */
public class Student extends Person{
    private String id;
    private int score;
    public String say(){
        return super.say()+" "+id+" "+score;
    }
    public Student(String name, int age, String id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

