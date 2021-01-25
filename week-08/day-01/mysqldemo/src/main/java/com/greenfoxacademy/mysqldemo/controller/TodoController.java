package com.greenfoxacademy.mysqldemo.controller;

import com.greenfoxacademy.mysqldemo.model.Todo;
import com.greenfoxacademy.mysqldemo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {

    TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping({"/", "/list"})
    public String getIndex(@RequestParam (required = false) Boolean isDone, Model model) {
        if(isDone == null) {
            model.addAttribute("todoList", todoService.getAllTodos());
            return "todolist";
        } else if (isDone)
            model.addAttribute("todoList", todoService.getAllDones());
            return "todolist";
    }

    @GetMapping("/add")
    public String addPage() {
        return "add";
    }

    @PostMapping("/add")
    public String addTodo(@ModelAttribute Todo todo) {
        todoService.addTodo(todo);
        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String deleteTodo(@PathVariable Long id) {
        todoService.deleteTodoById(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String editPage(@PathVariable Long id, Model model) {
        model.addAttribute("todo", todoService.findById(id));
        return "edit";
    }

    @PostMapping("/{id}/edit")
    public String editTodo(@PathVariable Long id, @ModelAttribute Todo todo) {
        todoService.editTodo(id, todo);
        return "redirect:/";
    }

    @PostMapping("/")
    public String searchTodo(String input, Model model) {
        model.addAttribute("todoList", todoService.getBySearch(input));
        return "todolist";
    }
}
