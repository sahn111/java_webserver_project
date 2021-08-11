package com.example.demo.repository;

import com.example.demo.entity.Product_Features;
import com.example.demo.entity.Product_FeaturesId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Product_FeaturesRepository extends JpaRepository<Product_Features, Product_FeaturesId> {

}
