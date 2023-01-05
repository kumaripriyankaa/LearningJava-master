package School;

import lombok.Getter;

import java.util.List;

@Getter
public class Standard {
    private String stdName;
    private List<Student> students;

    public Standard(String stdName, List<Student> students) {
        this.stdName = stdName;
        this.students = students;
    }

}



