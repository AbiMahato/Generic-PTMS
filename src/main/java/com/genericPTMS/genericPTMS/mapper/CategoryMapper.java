package com.genericPTMS.genericPTMS.mapper;


import com.genericPTMS.genericPTMS.dto.CategoryDto;
import com.genericPTMS.genericPTMS.dto.UserDto;
import com.genericPTMS.genericPTMS.model.Category;
import com.genericPTMS.genericPTMS.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper extends GenericMapper<Category, CategoryDto>{
}
