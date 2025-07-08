package lambdas;

import java.util.function.Consumer;

public class LocalVariableExample2 {

    static int i = 1;
    int j=0;
    public static void main(String[] args) {

        LocalVariableExample2 obj = new LocalVariableExample2();
        //no restrictions with instance variable
        Consumer<Integer> c1 = i ->{
            System.out.println(i);
        };
        Consumer<Integer> c2 = j -> {
            System.out.println(j);
        };
        Consumer<Integer> c3 = k ->{
            i=3;
            System.out.println(obj.j);
        };
    }
}
