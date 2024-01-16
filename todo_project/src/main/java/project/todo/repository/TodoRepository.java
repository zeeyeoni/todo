package project.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.todo.domain.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
