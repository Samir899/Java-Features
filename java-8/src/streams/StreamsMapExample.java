package streams;

import data.StudentData;
import entity.Student;
import java.util.List;
import java.util.Set;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamsMapExample {

    public static List<String> getNamesList(){
        return StudentData.getAllStudent()
                .stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(toList());
    }

    public static Set<String> getNamesSet(){
        return StudentData.getAllStudent()
                .stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(toSet());
    }

    public static void main(String[] args) {
        System.out.println(getNamesList());
        System.out.println(getNamesSet());
    }
}
