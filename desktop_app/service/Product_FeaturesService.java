package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.entity.Product_Features;
import com.example.demo.entity.Product_FeaturesId;
import com.example.demo.repository.Product_FeaturesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Product_FeaturesService {
    @Autowired
    Product_FeaturesRepository product_featuresRepository;

    public Product_Features saveProduct_Features(Product_Features pf){
        return product_featuresRepository.save(pf);
    }

}
