package lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {

        /**
         * Prior to java 8
         */

        Comparator<Integer> comparator1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("Comparison result1: " + comparator1.compare(3, 2));

        /**
         * Java 8 - using lambdas
         */

        Comparator<Integer> comparator2 = (a, b) -> a.compareTo(b);
        System.out.println("Comparison result2: " + comparator2.compare(4, 5));

        /**
         * Simplifying it even further using method reference
         * Natural order of Integer comparison
         */
        Comparator<Integer> comparator3 = Integer::compareTo;
        System.out.println("Comparison result3: " + comparator3.compare(1, 1));
    }
}
