package com.greenfoxacademy.todoapp.controller;

import com.greenfoxacademy.todoapp.model.Todo;
import com.greenfoxacademy.todoapp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TodoController {

    TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/")
    public String showIndex(Model model) {
        model.addAttribute("todoList", todoService.getAllTodos());
        return "index";
    }

    @GetMapping("/add")
    public String showAdd() {
        return "add";
    }

    @PostMapping("/add")
    public String postAdd(@ModelAttribute Todo todo) {
        todoService.addTodo(todo);
        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        todoService.deleteTodoById(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/update")
    public String showUpdate(@PathVariable Long id, Model model) {
        model.addAttribute("todo", todoService.findById(id));
        return "update";
    }

    @PostMapping("/{id}/update")
    public String update(@PathVariable Long id, @ModelAttribute Todo todo) {
        todoService.updateTodoById(id, todo);
        return "redirect:/";
    }
}
