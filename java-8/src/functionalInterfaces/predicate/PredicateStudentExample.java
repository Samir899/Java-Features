package functionalInterfaces.predicate;

import data.StudentData;
import entity.Student;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = student -> student.getGpa()>8;
    static Predicate<Student> p2 = student -> student.getGradeLevel()>1;

    public static void main(String[] args) {
        filterStudents();
        filterStudentNegated();
    }

    public static void filterStudents(){

        System.out.println("------------------------ Filter students --------------------------");
        List<Student> list = StudentData.getAllStudent();
        list.forEach(student -> {
            if(p1.and(p2).test(student)){
                System.out.println(student);
            }
        });
    }

    public static void filterStudentNegated(){
        System.out.println("------------------------ Filter students Negated --------------------------");
        List<Student> list = StudentData.getAllStudent();
        list.forEach(student -> {
            if(p1.and(p2).negate().test(student)){
                System.out.println(student);
            }
        });
    }
}
