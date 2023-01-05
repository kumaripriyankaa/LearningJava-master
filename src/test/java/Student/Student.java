package Student;
import lombok.Getter;
import lombok.Setter;


@Getter
public class Student {
    int roll;
    String name;
    int age;


    public Student(int roll, String name, int age) {
        this.roll = roll;
        this.name = name;
        this.age =  age;
    }

}



