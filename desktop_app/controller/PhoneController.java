package com.example.demo.controller;

import com.example.demo.entity.Computer;
import com.example.demo.entity.Phone;
import com.example.demo.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PhoneController {
    @Autowired
    PhoneService phoneService;

    @PostMapping("/savephone")
    public Phone savePhone(@RequestBody Phone p)
    {
        return phoneService.savePhone(p);
    }

    @GetMapping("/getphone/{prod_id}")
    public Phone getPhone(@PathVariable String prod_id)
    {
        return phoneService.getPhone(prod_id);
    }

    @GetMapping("/getallphones")
    public List<Phone> getAllPhones(){return phoneService.getAllPhones();}

    @GetMapping("getallphonesbybrand/{name}")
    public List<Phone> getAllPhonesByBrand(@PathVariable String name){return phoneService.getAllPhonesByBrand(name);}

    @GetMapping("getallphonesbycriteria/{screen_size}/{name}")
    public List<Phone> getAllPhonesByCriteria(@PathVariable String screen_size, @PathVariable String name){return phoneService.getAllPhonesByCriteria(screen_size, name);}
}
