package functionalInterfaces.consumer;

import data.StudentData;
import entity.Student;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static List<Student> students = StudentData.getAllStudent();
    static Consumer<Student> c1 = student -> System.out.println(student);
    static Consumer<Student> c2 = student -> System.out.print(student.getName());
    static Consumer<Student> c3 = student -> System.out.println(student.getActivities());

    static void printAllStudents(){
        System.out.println("------------- Print All Students -------------");
        students.forEach(c1);
    }

    static void printNameAndActivities(){
        System.out.println("------------- Print Name and Activities of Students -------------");
        students.forEach(c2.andThen(c3));
    }

    static void printWithCondition(){
        System.out.println("------------- Print With Conditions -------------");
        students.forEach(student -> {
            if(student.getGradeLevel()>=5 && student.getGpa()>=6){
                c2.andThen(c3).accept(student);
            }
        });
    }

    public static void main(String[] args) {

        Consumer<String> consumer1 = s -> System.out.println(s.toUpperCase());
        consumer1.accept("Java 8");
        printAllStudents();
        printNameAndActivities();
        printWithCondition();
    }


}
