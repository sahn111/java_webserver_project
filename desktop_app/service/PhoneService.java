package com.example.demo.service;

import com.example.demo.entity.Computer;
import com.example.demo.entity.Phone;
import com.example.demo.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneService {
    @Autowired
    PhoneRepository phoneRepository;

    public Phone savePhone(Phone p){
        return phoneRepository.save(p);
    }

    public Phone getPhone(String prod_id){
        return phoneRepository.findById(prod_id).orElse(null);
    }

    public List<Phone> getAllPhones(){return phoneRepository.getAllPhones();}

    public List<Phone> getAllPhonesByBrand(String name){return phoneRepository.getAllPhonesByBrand(name);}

    public List<Phone> getAllPhonesByCriteria(String screen_size, String name){return  phoneRepository.getAllPhonesByCriteria(screen_size, name);}
}
