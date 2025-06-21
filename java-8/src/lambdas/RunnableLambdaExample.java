package lambdas;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        /**
         * Prior to Java 8
         */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };
        new Thread(runnable).start();


        /**
         * Java 8 - Lambda Syntax
         */

        Runnable runnableLambda = () -> {
            System.out.println("Inside Runnable 2");
        };
        new Thread(runnableLambda).start();

        /**
         * In case you have one line of code to be executed in lambda body
         */

        Runnable runnableLambda2 = () -> System.out.println("Inside Runnable 3");

        new Thread(runnableLambda2).start();

        /**
         * Simplifying it further by passing the lambda directly to Thread constructor as parameter
         */

        new Thread(()->System.out.println("Inside Runnable 4")).start();

    }
}
