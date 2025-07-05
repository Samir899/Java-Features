package methodReference;

import data.StudentData;
import entity.Student;
import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    /**
     * className::methodName
     */
    static Consumer<Student> c1 = System.out::println;

    /**
     * className::instanceMethodName
     */
    static Consumer<Student> c2 = Student::printActivities;

    public static void main(String[] args) {
        StudentData.getAllStudent().forEach(c1);
        StudentData.getAllStudent().forEach(c2);
    }
}
