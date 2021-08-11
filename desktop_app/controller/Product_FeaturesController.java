package com.example.demo.controller;

import com.example.demo.entity.Product_Features;
import com.example.demo.service.Product_FeaturesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Product_FeaturesController {
    @Autowired
    Product_FeaturesService productFeaturesService;

    @PostMapping("/addproductfeature")
    public Product_Features saveProductFeatures(@RequestBody Product_Features pf)
    {
        return productFeaturesService.saveProduct_Features(pf);
    }

}
