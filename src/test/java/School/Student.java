package School;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentName;
    private int english;
    private int hindi;
    private int science;
    private int maths;

    public Student(String studentName, int english, int hindi, int science, int maths) {
        this.studentName = studentName;
        this.english = english;
        this.hindi = hindi;
        this.science = science;
        this.maths = maths;
    }

    public String getName() {
        return studentName;
    }

    public int getTotalPercentage() {
        return (english + hindi + science + maths) / 4;
    }


    public static List<Student> getStudentsOfTenthStd() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Anshul", 85, 44, 71, 50));
        students.add(new Student("Anuradha", 75, 84, 81, 30));
        students.add(new Student("Manjunath", 65, 74, 71, 60));
        students.add(new Student("Priyanka", 90, 40, 78, 45));
        return students;
    }

    public static List<Student> getStudentsOfEleventhStd() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Poornima", 55, 64, 61, 60));
        students.add(new Student("Arjun", 45, 54, 51, 90));
        students.add(new Student("Spoorthi", 35, 44, 50, 70));
        return students;
    }

    public static List<Student> getStudentsOfTwelfthStd() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ankit", 25, 34, 31, 50));
        students.add(new Student("Ikshit", 15, 24, 21, 60));
        students.add(new Student("Pappu", 5, 14, 11, 45));
        return students;
    }
}
