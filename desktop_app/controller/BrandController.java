package com.example.demo.controller;


import com.example.demo.entity.Brand;
import com.example.demo.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BrandController {
    @Autowired
    BrandService brandService;

    @PostMapping("/addBrand")
    public Brand saveBrand(@RequestBody Brand b)
    {
        return brandService.saveBrand(b);
    }

    @GetMapping("/getbrand/{name}")
    public Brand getBrand(@PathVariable String name)
    {
        return brandService.getBrand(name);
    }
}
