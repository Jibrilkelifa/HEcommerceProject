package com.example.HEproject.service;

import com.example.HEproject.domain.Category;
import com.example.HEproject.domain.Product;
import com.example.HEproject.dto.CategoryDTO;
import com.example.HEproject.dto.ProductDTO;
import com.example.HEproject.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category createCategory(CategoryDTO categoryDTO) {
        Category category = new Category();
        category.setName(categoryDTO.getName());
        category.setDescription(categoryDTO.getDescription());
        return categoryRepository.save(category);
    }
    public Product postPoduct(Long categoryId, ProductDTO productDTO){
        return  null;

    }
}
