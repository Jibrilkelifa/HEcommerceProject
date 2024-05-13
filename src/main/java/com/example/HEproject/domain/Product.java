package com.example.HEproject.domain;


import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Lob
    private String description;
    private  Integer price;
    private  byte[] image;
//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinColumn(name = "category_id", nullable = false)
////    @OnDelete(action = OnDeleteAction.CASCADE)
////    @JsonIgnore
//    private Category category;
}
