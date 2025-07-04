package functionalInterfaces.supplier;

import data.StudentData;
import entity.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    static Supplier<Student> studentSupplier = () ->
            new Student("Samir Kumar", 3, 8.3, "male", Arrays.asList("Badminton", "Coding"));
    static Supplier<List<Student>> studentListSupplier = StudentData::getAllStudent;

    public static void main(String[] args) {
        System.out.println("Get one students: " + studentSupplier.get());
        System.out.println("---------------------------------------------------");
        System.out.println("Get Student List: ");
        studentListSupplier.get().forEach(System.out::println);
    }
}
