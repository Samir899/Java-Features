package methodReference;

import data.StudentData;
import entity.Student;

import java.util.function.Predicate;

public class MethodReferenceExample {

    static Predicate<Student> p1 = MethodReferenceExample::greaterThanGradeLevel;

    public static boolean greaterThanGradeLevel(Student student){
        return student.getGradeLevel()>=3;
    }

    public static void main(String[] args) {
        System.out.println(p1.test(StudentData.studentSupplier.get()));
    }
}
