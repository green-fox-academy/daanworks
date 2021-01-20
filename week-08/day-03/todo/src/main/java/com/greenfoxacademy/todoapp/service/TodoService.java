package com.greenfoxacademy.todoapp.service;

import com.greenfoxacademy.todoapp.model.Todo;
import com.greenfoxacademy.todoapp.repository.TodoRepository;
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

    public List<Todo> getAllTodos() {
        return (List<Todo>) todoRepository.findAll();
    }

    public Todo findById(Long id) {
        return todoRepository.findTodoById(id);
    }

    public void addTodo(Todo todo) {
        todoRepository.save(todo);
    }

    public void deleteTodoById(Long id) {
        Todo todo = todoRepository.findTodoById(id);
        todoRepository.delete(todo);
    }

    public void updateTodoById(Long id, Todo updatedTodo) {
        updatedTodo.setId(id);
        todoRepository.save(updatedTodo);
    }
}
