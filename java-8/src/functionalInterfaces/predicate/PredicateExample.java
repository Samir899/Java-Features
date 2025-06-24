package functionalInterfaces.predicate;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> isEven = a -> a%2==0;
    static Predicate<Integer> isMultipleOfFive = a -> a%5==0;

    static void printAnd(){
        System.out.println("------- Result of And -------");
        System.out.println(isEven.and(isMultipleOfFive).test(10));
    }
    static void printOr(){
        System.out.println("------- Result of Or -------");
        System.out.println(isEven.or(isMultipleOfFive).test(10));
    }
    static void printNegate(){
        System.out.println("------- Result of Negate -------");
        System.out.println(isEven.negate().test(10));
    }
    public static void main(String[] args) {
        printAnd();
        printOr();
        printNegate();
    }

}
