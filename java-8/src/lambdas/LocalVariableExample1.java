package lambdas;

import java.util.function.Consumer;

public class LocalVariableExample1 {

    public static void main(String[] args) {
        int i=2;
//        local variable i cannot be used as parameters in lambda expression.
//        Consumer<Integer> c = i -> {
//           System.out.println(i);
//       };
//        local variables cannot be re assigned inside a lambda expression
//        Consumer<Integer> c1 = j -> {
//            i=4;
//            i++;
//            System.out.println(i+j);
//        };
//        local variables cannot be re declared inside a lambda expression
//        Consumer<Integer> c1 = j -> {
//            int i=4;
//            System.out.println(i+j);
//        };

    }
}
