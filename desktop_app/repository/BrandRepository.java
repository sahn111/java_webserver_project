package com.example.demo.repository;

import com.example.demo.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand, String> {
    @Query("SELECT b FROM Brand b WHERE b.name LIKE %?1%")
    public List<Brand> getBrandByName(String name);
}
