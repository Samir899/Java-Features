package data;

import entity.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentData {

    public static List<Student> getAllStudent(){
        List<Student> students = new ArrayList<>();

        students.add(new Student("Samir Kumar", 3, 8.3, "male", Arrays.asList("Badminton", "Coding")));
        students.add(new Student("Neeraj Kumar", 3, 7.3, "male", Arrays.asList("Swimming", "Driving")));
        students.add(new Student("Sagar Bhatia", 4, 8.3, "male", Arrays.asList("Cricket", "Dancing")));
        students.add(new Student("Rishikesh Sinha", 4, 6.9, "male", Arrays.asList("Singing", "Dancing")));
        students.add(new Student("Arvind", 5, 5.5, "male", Arrays.asList("Music", "Movies")));
        students.add(new Student("Pradeep", 5, 6.3, "male", Arrays.asList("Football", "Running")));
        return students;
    }
}
