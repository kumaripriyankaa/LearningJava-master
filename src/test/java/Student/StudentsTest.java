package Student;

import Student.Student;
import Student.Standard;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class StudentsTest {

    @Test
    public void test1() {


        Student student1 = new Student(1, "Krishna", 20);
        Student student2 = new Student(2, "Priyanka", 21);
        Student student3 = new Student(3, "Priyanka", 14);
        Student student4 = new Student(4, "Priyanka", 15);
        Student student5 = new Student(5, "Priyanka", 16);

        Standard studentsList = new Standard();
        studentsList.addStudents(student1, student2, student3, student4, student5);

        List<Student> students = List.of(student1, student2, student3, student4, student5);

        studentsList.checkAge(students).forEach(System.out::println);

//        result.stream().forEach(t -> System.out.println(t));

        Assert.assertTrue(studentsList.checkAgeNew(student1));


    }
}
