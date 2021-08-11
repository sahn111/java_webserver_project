package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "prod_id")
public class Product {
    @Id
    private String prod_id;
    private String screen_size;
    private String model;
    private int price;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    List<Comment> comments;

    @ManyToOne
    private Brand brand;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    List<Product_Features> product_feature;


}
