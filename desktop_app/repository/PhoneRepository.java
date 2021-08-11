package com.example.demo.repository;

import com.example.demo.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PhoneRepository extends JpaRepository<Phone, String> {
    @Query("SELECT p FROM Phone p WHERE p.prod_id LIKE %?1%")
    public List<Phone> getPhoneById(String prod_id);

    @Query("SELECT p FROM Phone p")
    public List<Phone> getAllPhones();

    @Query("SELECT p FROM Phone p,Brand b WHERE b.name LIKE %?1% and b.name LIKE p.brand.name")
    public List<Phone> getAllPhonesByBrand(String name);

    @Query("SELECT c FROM Phone c,Brand b  WHERE c.screen_size LIKE %?1% AND b.name LIKE %?2% AND c.brand.name LIKE b.name")
    public List<Phone> getAllPhonesByCriteria(String screen_size, String name);
}
