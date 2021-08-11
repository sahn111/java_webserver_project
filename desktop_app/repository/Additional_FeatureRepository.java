package com.example.demo.repository;

import com.example.demo.entity.Additional_Feature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Additional_FeatureRepository extends JpaRepository<Additional_Feature, Integer> {
    @Query("SELECT af FROM Additional_Feature af WHERE af.af_id LIKE %?1%")
    public List<Additional_Feature> getAdditional_FeatureById(Integer af_id);

}
