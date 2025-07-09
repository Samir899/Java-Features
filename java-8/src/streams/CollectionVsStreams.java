package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionVsStreams {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        //You can add or remove elements at any point of time
        names.add("Adam");
        names.add("Eve");
        names.add("Julious");
        names.add("Prachi");

        names.remove("Prachi");

        //You can iterate over the list n number of times
        System.out.println("------------------Traversing list 1st time-------------------------");
        for(String name : names){
            System.out.println(name);
        }
        System.out.println("------------------Traversing list 2nd time-------------------------");
        for (String name : names){
            System.out.println(name);
        }

        //you iterate over list using external for loop while for streams you can
        //use the .forEach method available on Stream class

        System.out.println("------------------Traversing streams 1st time-------------------------");
        Stream<String> nameStream = names.stream();
        nameStream.forEach(System.out::println);
        System.out.println("------------------Traversing streams 2nd time gives error-------------------------");
        //you can traverse on streams only once
        nameStream.forEach(System.out::println); //gives error: xception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed



    }
}
