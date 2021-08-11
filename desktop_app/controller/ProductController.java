package com.example.demo.controller;

import com.example.demo.entity.Phone;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/saveproduct")
    public Product saveProduct(@RequestBody Phone pr)
    {
        return productService.saveProduct(pr);
    }

    @GetMapping("/getproduct/{prod_id}")
    public Product getProduct(@PathVariable String prod_id)
    {
        return productService.getProduct(prod_id);
    }

    @GetMapping("allphones/{name}")
    public List<Product> allPhones(@PathVariable String name){return productService.allPhones(name);}

}
