package project.todo.testController;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import project.todo.domain.Todo;
import project.todo.repository.TodoRepository;

@SpringBootTest
public class test {

    @Autowired
    private TodoRepository repository;

    @Test
    public void insert() {
        Todo todo = Todo.builder()
                .content("테스트 입니당 ~")
                .build();

        repository.save(todo);
    }
}
