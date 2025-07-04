package methodReference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    static Function<String, String> toUpperCaseLambda = s -> s.toUpperCase();
    static Function<String, String> toUpperCaseLambdaUsingMethodReference = String::toUpperCase;

    public static void main(String[] args) {
        String result = toUpperCaseLambda.apply("Java 8");
        System.out.println(result);
        result = toUpperCaseLambdaUsingMethodReference.apply("Java 8");
        System.out.println(result);
    }
}
