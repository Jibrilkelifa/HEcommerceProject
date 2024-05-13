package com.example.HEproject.service;

import com.example.HEproject.domain.Category;
import com.example.HEproject.dto.CategoryDTO;
import org.springframework.stereotype.Service;
@Service
public interface AdminService {
    public Category createCategory(CategoryDTO categoryDTO);
}
