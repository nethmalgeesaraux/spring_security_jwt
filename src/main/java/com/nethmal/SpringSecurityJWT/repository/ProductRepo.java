package com.nethmal.SpringSecurityJWT.repository;


import com.nethmal.SpringSecurityJWT.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}