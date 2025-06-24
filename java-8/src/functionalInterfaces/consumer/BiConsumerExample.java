package functionalInterfaces.consumer;

import data.StudentData;
import entity.Student;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    static List<Student> students = StudentData.getAllStudent();
    static BiConsumer<String, String> biConsumer1 = (a, b) -> System.out.println("a: " + a + " | " + "b: " + b);
    static BiConsumer<Integer, Integer> multiply = (a, b) -> System.out.println("Multiplication is: " + a*b);
    static BiConsumer<Integer, Integer> divide = (a, b) -> System.out.println("Division is: " + a/b);
    static BiConsumer<String, List<String>> printStudent = (name, activities) -> System.out.println("name: " + name + " | " + "Activities: " + activities);

    static void printStudentNameAndActivities(){
        students.forEach(student -> printStudent.accept(student.getName(), student.getActivities()));
    }

    public static void main(String[] args) {
        biConsumer1.accept("Java 8", "Java 11");
        multiply.andThen(divide).accept(10, 5);
        printStudentNameAndActivities();
    }
}
