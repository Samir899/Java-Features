package streams;

import data.StudentData;
import entity.Student;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    static Predicate<Student> p1 = student -> student.getGradeLevel() > 3;
    static Predicate<Student> p2 = student -> student.getGpa() > 7.5;
    static BiConsumer<String, List<String>> c = (name, activities) -> {
        System.out.println(name + "->" + activities);
    };

    public static void main(String[] args) {
        Map<String, List<String>> map = StudentData.getAllStudent()
                .stream()
                .filter(p1)
                .filter(p2)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));
        map.forEach(c);
    }
}