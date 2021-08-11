package com.example.demo.service;

import com.example.demo.entity.Additional_Feature;
import com.example.demo.repository.Additional_FeatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Additional_FeatureService {
    @Autowired
    Additional_FeatureRepository additional_featureRepository;

    public Additional_Feature saveAdditional_Feature(Additional_Feature af){
        return additional_featureRepository.save(af);
    }

    public Additional_Feature getAdditional_Feature(long af_id){
        return additional_featureRepository.findById((int) af_id).orElse(null);
    }
}
