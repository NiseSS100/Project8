package fmi.informatics.hw8;

import fmi.informatics.extending.Student;
import java.util.Arrays;
import java.util.List;

public class Data {
    public static  void sortAB() {
        List<Student> Students = Arrays.asList(
                        Student.StudentGenerator.make(),
                        Student.StudentGenerator.make(),
                        Student.StudentGenerator.make(),
                        Student.StudentGenerator.make(),
                        Student.StudentGenerator.make());
        Students.sort((a, b) -> b.getSpeciality().compareTo(a.getSpeciality()));
        System.out.println(Students);
    }

    public static  void sortBA() {
        List<Student> Students = Arrays.asList(
                        Student.StudentGenerator.make(),
                        Student.StudentGenerator.make(),
                        Student.StudentGenerator.make(),
                        Student.StudentGenerator.make(),
                        Student.StudentGenerator.make());
        Students.sort((b, a) -> a.getSpeciality().compareTo(b.getSpeciality()));
        System.out.println(Students);
    }
}