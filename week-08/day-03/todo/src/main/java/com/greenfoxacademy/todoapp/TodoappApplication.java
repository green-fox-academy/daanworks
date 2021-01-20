package com.greenfoxacademy.todoapp;

import com.greenfoxacademy.todoapp.model.Todo;
import com.greenfoxacademy.todoapp.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoappApplication implements CommandLineRunner {

    private TodoRepository todoRepository;

    @Autowired
    public TodoappApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodoappApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("Buy milk"));
        todoRepository.save(new Todo("Do the laundry"));
        todoRepository.save(new Todo("Call the lawyer"));
        todoRepository.save(new Todo("Eat coffee"));
    }
}
