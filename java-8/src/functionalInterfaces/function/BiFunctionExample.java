package functionalInterfaces.function;

import data.StudentData;
import entity.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctionExample {

    static BiPredicate<Double, Integer> p1 = (gpa, grade) -> gpa > 7 &&  grade > 2;

    static BiFunction<List<Student>, BiPredicate<Double, Integer>, Map<String, Double>> f =
            (students, predicate) -> {
                Map<String, Double> map = new HashMap<>();
                students.forEach(student -> {
                    if(predicate.test(student.getGpa(), student.getGradeLevel())){
                        map.put(student.getName(), student.getGpa());
                    }
                });
                return map;
            };
    public static void printStudentMap(){
        Map<String, Double> map = f.apply(StudentData.getAllStudent(), p1);
        System.out.println(map);
    }

    public static void main(String[] args) {
        printStudentMap();
    }
}
