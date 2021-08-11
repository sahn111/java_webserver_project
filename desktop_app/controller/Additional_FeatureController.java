package com.example.demo.controller;

import com.example.demo.entity.Additional_Feature;
import com.example.demo.service.Additional_FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Additional_FeatureController {
    @Autowired
    Additional_FeatureService additionalfeatureService;

    @PostMapping("/addadditionalfeature")
    public Additional_Feature saveAdditionalFeature(@RequestBody Additional_Feature af)
    {
        return additionalfeatureService.saveAdditional_Feature(af);
    }

    @GetMapping("/getadditionalfeature/{id}")
    public Additional_Feature getAdditionalFeature(@PathVariable int id)
    {
        return additionalfeatureService.getAdditional_Feature(id);
    }

}
