package constructorReference;

import entity.Student;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {

    static Supplier<Student> studentSupplier = Student::new;
    static Function<String, Student> studentFunction = Student::new;
    static BiFunction<String, Integer, Student> studentBiFunction = Student::new;

    public static void main(String[] args) {
        System.out.println("Empty Student: " + studentSupplier.get());
        System.out.println("Student with Name: " + studentFunction.apply("Samir"));
        System.out.println("Student with Name and Grade: " + studentBiFunction.apply("Samir", 5));
    }
}
