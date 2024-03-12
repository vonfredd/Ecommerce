package com.ecommerce.ecommerce.repository;

import com.ecommerce.ecommerce.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
