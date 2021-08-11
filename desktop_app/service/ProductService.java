package com.example.demo.service;

import com.example.demo.entity.Phone;
import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public Product saveProduct(Product p){
        return productRepository.save(p);
    }

    public Product getProduct(String prod_id){
        return productRepository.findById(prod_id).orElse(null);
    }

    public List<Product> allPhones(String name){return productRepository.allPhones(name);}

}
