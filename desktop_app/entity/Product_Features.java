package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Product_Features {
    @EmbeddedId
    Product_FeaturesId id;

    @ManyToOne
    @JoinColumn(name = "prod_id", insertable = false, updatable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "af_id", insertable = false, updatable = false)
    private Additional_Feature feature;
}
