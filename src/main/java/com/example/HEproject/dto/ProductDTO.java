package com.example.HEproject.dto;


import lombok.Data;



@Data
public class ProductDTO {
    private Long id;
    private String name;
    private String description;
    private  Integer price;
    private  byte[] image;

}
