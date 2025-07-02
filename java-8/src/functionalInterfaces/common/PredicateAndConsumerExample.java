package functionalInterfaces.common;

import data.StudentData;
import entity.Student;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<Student> p1 = student -> student.getGpa()>7;
    Predicate<Student> p2 = student -> student.getGradeLevel()>3;

    BiConsumer<String, List<String>> c2 = (name, activities) -> System.out.println(name + " : " + activities);
    Consumer<Student> c1 = student -> {
      if(p1.and(p2).test(student)){
          c2.accept(student.getName(), student.getActivities());
      }
    };

    void printNameAndActivities(List<Student> students){
        students.forEach(c1);
    }

    public static void main(String[] args) {
        new PredicateAndConsumerExample().printNameAndActivities(StudentData.getAllStudent());
    }
}
