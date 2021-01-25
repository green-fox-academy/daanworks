package com.greenfoxacademy.mysqldemo.repository;

import com.greenfoxacademy.mysqldemo.model.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {
    List<Todo> findAllByDoneIsTrue();
    Todo findTodoById(Long id);
    List<Todo> findByTitleContains(String input);
}
