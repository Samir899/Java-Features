package functionalInterfaces.predicate;

import data.StudentData;
import entity.Student;

import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateExample {

    static BiPredicate<Double, Integer> p1 = (gpa, grade)-> gpa>7 && grade>3;

    public static void printStudents(){
        List<Student> students = StudentData.getAllStudent();
        students.forEach(x->{
            if(p1.test(x.getGpa(), x.getGradeLevel())){
                System.out.println(x);
            }
        });
    }

    public static void main(String[] args) {
        printStudents();
    }
}
