package com.laurencetuchin.springbootblogapplication.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String title;

    // TODO - add validation constraints
    @Column(columnDefinition = "TEXT")
//    @NotBlank(message = "Body must not be blank")
    private String body;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;



    @NotNull
    @ManyToOne
    @JoinColumn(name = "account_id", referencedColumnName = "id", nullable = false)
    private Account account;


    @Override
    public String toString() {
        return "Post{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", body='" + body + '\'' +
            ", createdAt=" + createdAt +
            ", updatedAt=" + updatedAt +
            ", account=" + account +
            '}';
    }
}
