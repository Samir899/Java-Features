package functionalInterfaces.function;

import java.util.function.Function;

public class FunctionInterfaceExample {

    static Function<String, String> f1 = name -> name.toUpperCase();
    static Function<String, String> f2 = name -> name.concat(" Default");

    static void printName(){
        String name = "java 8";
        String result = f1.andThen(f2).apply(name);
        System.out.println(result);
    }

    static void printAllCaps(){
        String name = "Java 8";
        String result = f1.compose(f2).apply(name);
        System.out.println(result);
    }

    public static void main(String[] args) {
        printName();
        printAllCaps();
    }
}
