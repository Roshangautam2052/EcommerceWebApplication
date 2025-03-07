package com.ecommerceapp.springbootecommerce.repository;

import com.ecommerceapp.springbootecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
