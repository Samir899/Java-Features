package functionalInterfaces.binaryOp;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);

    static BinaryOperator<Integer> binaryOperator = (a, b) -> a*b;

    public static void main(String[] args) {
        System.out.println("Result of binary Ops: " + binaryOperator.apply(3, 4));
        System.out.println("Result of minBy: " + BinaryOperator.minBy(comparator).apply(4, 5));
        System.out.println("Result of maxBy: " + BinaryOperator.maxBy(comparator).apply(4, 5));
    }
}
