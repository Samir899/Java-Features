package functionalInterfaces.consumer;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        Consumer<String> consumer1 = s -> System.out.println(s.toUpperCase());
        consumer1.accept("Java 8");
    }
}
