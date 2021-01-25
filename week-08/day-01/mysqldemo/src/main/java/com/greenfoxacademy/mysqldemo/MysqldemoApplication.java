package com.greenfoxacademy.mysqldemo;

import com.greenfoxacademy.mysqldemo.model.Todo;
import com.greenfoxacademy.mysqldemo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqldemoApplication implements CommandLineRunner {

    TodoRepository todoRepository;

    @Autowired
    public MysqldemoApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(MysqldemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("daily task", false, false));
        todoRepository.save(new Todo("make the beds", true, true));
        todoRepository.save(new Todo("do the washing up", true, false));
        todoRepository.save(new Todo("clean the bathroom", true, true));
        todoRepository.save(new Todo("wipe all the surfaces", true, false));
        todoRepository.save(new Todo("remove the grease", true, true));
        todoRepository.save(new Todo("tidy up", false, false));
    }
}
