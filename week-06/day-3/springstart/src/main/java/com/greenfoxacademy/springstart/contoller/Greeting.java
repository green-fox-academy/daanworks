package com.greenfoxacademy.springstart.contoller;

import org.springframework.stereotype.Controller;
import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    Long greetCount;
    static AtomicLong atomicLong = new AtomicLong();
    String content;

    public Greeting(String content) {
        this.greetCount = 0L;
        this.content = content;
    }

    public Long getGreetCount() {
        return atomicLong.getAndIncrement();
    }

    public String getContent() {
        return content;
    }

    public static AtomicLong getAtomicLong() {
        return atomicLong;
    }
}
