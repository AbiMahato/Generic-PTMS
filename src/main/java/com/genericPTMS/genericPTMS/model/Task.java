package com.genericPTMS.genericPTMS.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "tasks")
public class Task extends BaseEntity{
    private String title;
    private String description;
    private LocalDateTime dueDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

//    @Enumerated(EnumType.STRING)
//    private Priority priority;
//
//    @Enumerated(EnumType.STRING)
//    private TaskStatus status;
}
