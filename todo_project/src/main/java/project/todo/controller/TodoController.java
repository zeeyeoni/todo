package project.todo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import project.todo.domain.Todo;
import project.todo.service.TodoService;

import java.util.List;

@Controller
@RequestMapping("/todo")
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;

    @GetMapping
    public String getList(Model model) {
        List<Todo> todoLists = todoService.getTodoList();
        model.addAttribute("todoList", todoLists);

        return "todo/todo";
    }

    @PostMapping("/add")
    public String add(String content) {
        todoService.addTodo(content);

        return "redirect:/todo";
    }
}
