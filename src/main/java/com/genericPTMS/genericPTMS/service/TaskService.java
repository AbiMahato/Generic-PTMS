package com.genericPTMS.genericPTMS.service;

import com.genericPTMS.genericPTMS.dto.TaskDto;
import com.genericPTMS.genericPTMS.mapper.TaskMapper;
import com.genericPTMS.genericPTMS.model.Task;
import com.genericPTMS.genericPTMS.repository.TaskRepo;
import org.springframework.stereotype.Service;

@Service
public class TaskService extends BaseServiceImpl<Task, TaskDto>{
    public TaskService(TaskRepo taskRepository, TaskMapper taskMapper) {
        super(taskRepository, taskMapper);
    }
}
