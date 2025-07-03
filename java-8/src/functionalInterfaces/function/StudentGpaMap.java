package functionalInterfaces.function;

import data.StudentData;
import entity.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class StudentGpaMap {

    static Function<List<Student>, Map<String, Double>> f = students -> {
        Map<String, Double> map = new HashMap<>();
        students.forEach(student-> map.put(student.getName(), student.getGpa()));
        return map;
    };

    public static void main(String[] args) {
        Map<String, Double> map = f.apply(StudentData.getAllStudent());
        System.out.println(map);
    }
}
