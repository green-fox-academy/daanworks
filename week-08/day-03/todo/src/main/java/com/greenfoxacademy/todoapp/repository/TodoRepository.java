package com.greenfoxacademy.todoapp.repository;

import com.greenfoxacademy.todoapp.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
    Todo findTodoById(Long id);
}
