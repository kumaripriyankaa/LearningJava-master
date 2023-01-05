package School;

import java.util.ArrayList;
import java.util.List;

import static School.Student.*;

public class School {


    public static void main(String[] args) {

        List<Standard> standards = new ArrayList<>();
        standards.add(new Standard("Class 10", getStudentsOfTenthStd()));
        standards.add(new Standard("Class 11", getStudentsOfEleventhStd()));
        standards.add(new Standard("Class 12", getStudentsOfTwelfthStd()));


        for (Standard standard : standards) {
            Student topper = standard.getStudents().get(0);
            for (int i = 1; i < standard.getStudents().size(); i++) {
                if (standard.getStudents().get(i).getTotalPercentage() > topper.getTotalPercentage()) {
                    topper = standard.getStudents().get(i);
                }
            }
            System.out.println("The topper for " + standard.getStdName() + " is: " + topper.getName());
        }
    }


}