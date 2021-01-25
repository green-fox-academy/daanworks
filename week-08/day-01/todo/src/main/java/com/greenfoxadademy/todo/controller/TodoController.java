package com.greenfoxadademy.todo.controller;

import com.greenfoxadademy.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

    TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping({"/", "/list"})
    public String getIndex(Model model) {
        model.addAttribute("todoList", todoService.getAllTodos());
        return "todolist";
    }
}
