package functionalInterfaces.unaryOp;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    static UnaryOperator<String> unaryOperator = name -> name.concat(" Kumar");

    public static void main(String[] args) {
        String result = unaryOperator.apply("Samir");
        System.out.println(result);
    }
}
