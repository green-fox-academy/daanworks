package com.greenfoxadademy.todo.service;

import com.greenfoxadademy.todo.model.Todo;
import com.greenfoxadademy.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public String list() {
        return "This is my first Todo";
    }

    public List<Todo> getAllTodos() {
        return (List<Todo>) todoRepository.findAll();
    }
}
