package com.genericPTMS.genericPTMS.service;

import com.genericPTMS.genericPTMS.dto.CategoryDto;
import com.genericPTMS.genericPTMS.mapper.CategoryMapper;
import com.genericPTMS.genericPTMS.model.Category;
import com.genericPTMS.genericPTMS.repository.CategoryRepo;
import org.springframework.stereotype.Service;

@Service
public class CategoryService extends BaseServiceImpl<Category , CategoryDto> {
    public CategoryService(CategoryRepo categoryRepo , CategoryMapper categoryMapper) {
        super(categoryRepo, categoryMapper);
    }
}
