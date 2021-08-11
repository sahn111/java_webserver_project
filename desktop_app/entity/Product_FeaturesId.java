package com.example.demo.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Product_FeaturesId implements Serializable {
    long prod_id;
    long af_id;
}
