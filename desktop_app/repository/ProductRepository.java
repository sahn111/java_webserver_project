package com.example.demo.repository;

import com.example.demo.entity.Phone;
import com.example.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, String> {
    @Query("SELECT p FROM Product p WHERE p.prod_id LIKE %?1%")
    public List<Product> getProductById(String prod_id);

    @Query("SELECT p FROM Product p,Brand b WHERE b.name LIKE %?1% and b.name LIKE p.brand.name")
    public List<Product> allPhones(String name);

}
