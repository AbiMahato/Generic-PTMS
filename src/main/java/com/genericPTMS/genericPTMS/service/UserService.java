package com.genericPTMS.genericPTMS.service;

import com.genericPTMS.genericPTMS.dto.UserDto;
import com.genericPTMS.genericPTMS.mapper.UserMapper;
import com.genericPTMS.genericPTMS.model.User;
import com.genericPTMS.genericPTMS.repository.UserRepo;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseServiceImpl<User, UserDto>{
    public UserService(UserRepo userRepo, UserMapper userMapper) {
        super(userRepo , userMapper);
    }
}
