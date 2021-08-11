package com.example.demo.service;


import com.example.demo.entity.Brand;
import com.example.demo.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {
    @Autowired
    BrandRepository brandRepository;

    public Brand saveBrand(Brand b){
        return brandRepository.save(b);
    }

    public Brand getBrand(String name){
        return brandRepository.findById(name).orElse(null);
    }


}

