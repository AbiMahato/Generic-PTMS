package com.genericPTMS.genericPTMS.mapper;


import com.genericPTMS.genericPTMS.dto.UserDto;
import com.genericPTMS.genericPTMS.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper extends GenericMapper<User, UserDto>{
}
