package com.genericPTMS.genericPTMS.dto;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class TaskDto {
    private Long id;
    private String title;
    private String description;
    private LocalDateTime dueDate;
    private String createdAt;
    private String updatedAt;
//    @NotEmpty
//    private String priority;
//    @NotEmpty
//    private String status;

    private String userName;
    private String categoryName;
}
