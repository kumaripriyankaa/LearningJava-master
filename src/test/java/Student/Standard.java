package Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Standard {

    List<Student> studentsList;

    public Standard(){
        studentsList = new ArrayList<Student>();
    }
    public void addStudents(Student ... student){
        for(Student student1:student){
            studentsList.add(student1);
        }
    }

    public List checkAge(List<Student> studentsList){
        return studentsList.stream().filter(t -> t.getAge()<15).collect(Collectors.toList());
    }

    public boolean checkAgeNew(Student student){
        return student.getAge() > 15;
    }
}
