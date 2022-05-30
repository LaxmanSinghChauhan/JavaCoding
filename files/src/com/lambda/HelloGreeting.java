package com.lambda;

import com.lambda.Greeting;

public class HelloGreeting implements Greeting {

    @Override public void SayHello() {
        System.out.println("HelloGreeting implements Greeting");
    }
}
