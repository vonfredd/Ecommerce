package com.ecommerce.ecommerce.repository;

import com.ecommerce.ecommerce.entity.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CustomerRepository extends CrudRepository<Customer, UUID> {
}
