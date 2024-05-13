package com.example.HEproject.controller;

import com.example.HEproject.domain.Category;
import com.example.HEproject.dto.CategoryDTO;
import com.example.HEproject.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;
    @PostMapping("/category")
    public ResponseEntity<Category> createCategory (@RequestBody CategoryDTO categoryDTO){
        Category createdCategory = adminService.createCategory(categoryDTO);
        return  ResponseEntity.status(HttpStatus.CREATED).body(createdCategory);
    }

}
