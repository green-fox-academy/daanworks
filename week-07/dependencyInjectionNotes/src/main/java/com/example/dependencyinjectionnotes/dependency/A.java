package com.example.dependencyinjectionnotes.dependency;

public class A {

    private B b;

    public A(B b) {
        this.b = new B();
    }

}
