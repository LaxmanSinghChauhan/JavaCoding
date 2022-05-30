package com.lambda;

public class Main {
    public static void main(String []args)
    {
        // calling through other class implementation
        HelloGreeting helloGreeting = new HelloGreeting();
        helloGreeting.SayHello();

        // calling through Anonymous inner class
        Greeting greeting = new Greeting() {
            @Override public void SayHello() {
                System.out.println("direct invoking interface method inside main class");
            }
        };
        greeting.SayHello();

        //calling by lambda
        Greeting greetingLambda = ()-> System.out.println("invoking interface method by lambda");
        greetingLambda.SayHello();

    }
}
