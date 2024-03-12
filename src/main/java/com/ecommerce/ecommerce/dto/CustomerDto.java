package com.ecommerce.ecommerce.dto;

import com.ecommerce.ecommerce.entity.Customer;

public record CustomerDto(String name, int age, Long id) {

    public static CustomerDto map(Customer customer){
        return new CustomerDto( customer.getName(), customer.getAge(),customer.getId());
    }
    public static Customer map(CustomerDto customerDto){
        Customer customer = new Customer();
        customer.setId(customerDto.id);
        customer.setName(customerDto.name);
        customer.setAge(customerDto.age);
        return customer;
    }
}
