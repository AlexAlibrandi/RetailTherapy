package com.retailtherapy.ecommerce.dao;

import com.retailtherapy.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {


}
