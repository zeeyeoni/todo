package project.todo.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @Builder @AllArgsConstructor @RequiredArgsConstructor
public class Todo {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 30)
    private String content;
    @Enumerated(EnumType.STRING)
    private Status status;

}
