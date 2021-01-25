package com.greenfoxadademy.todo;

import com.greenfoxadademy.todo.model.Todo;
import com.greenfoxadademy.todo.repository.TodoRepository;
import com.greenfoxadademy.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

    TodoRepository todoRepository;

    @Autowired
    public TodoApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
        todoRepository.save(new Todo("Finish H2 workshop1"));
        todoRepository.save(new Todo("Finish JPA workshop2"));
        todoRepository.save(new Todo("Create CRUD project"));
    }
}
