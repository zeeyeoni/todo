package project.todo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.todo.domain.Status;
import project.todo.domain.Todo;
import project.todo.repository.TodoRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;

    public List<Todo> getTodoList() {
        return todoRepository.findAll();
    }

    public void addTodo(String content) {
        Todo todo = Todo.builder()
                .content(content)
                .status(Status.ACTIVE).build();

        todoRepository.save(todo);
    }

    public void delete(Todo todo) {
        todoRepository.delete(todo);
    }
}
