package com.genericPTMS.genericPTMS.mapper;

import com.genericPTMS.genericPTMS.dto.TaskDto;
import com.genericPTMS.genericPTMS.model.Task;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaskMapper extends GenericMapper<Task, TaskDto>{
}
