package com.greenfoxacademy.mysqldemo.service;

import com.greenfoxacademy.mysqldemo.model.Todo;
import com.greenfoxacademy.mysqldemo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoService {

    TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public Todo findById(Long id) {
        return todoRepository.findTodoById(id);
    }

    public List<Todo> getAllTodos() {
        return (List<Todo>) todoRepository.findAll();
    }

    public List<Todo> getAllDones() {
        return (List<Todo>) todoRepository.findAllByDoneIsTrue();
    }

    public void addTodo(Todo todo) {
        todoRepository.save(todo);
    }

    public void deleteTodoById(Long id) {
        Todo todo = todoRepository.findTodoById(id);
        todoRepository.delete(todo);
    }

    public void editTodo(Long id, Todo updatedTodo) {
        updatedTodo.setId(id);
        todoRepository.save(updatedTodo);
    }

    public List<Todo> getBySearch(String input) {
        return todoRepository.findByTitleContains(input);
    }

}
