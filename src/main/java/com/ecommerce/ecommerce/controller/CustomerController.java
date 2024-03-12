package com.ecommerce.ecommerce.controller;

import com.ecommerce.ecommerce.dto.CustomerDto;
import com.ecommerce.ecommerce.repository.CustomerRepository;
import com.ecommerce.ecommerce.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.UUID;

@Controller
public class CustomerController {

    @Autowired
    CustomerRepository repository;

    @GetMapping("/customer/{id}")
    public String getOne(@PathVariable UUID id, Model model) {
        Customer customerFromDb = repository.findById(id).get();

        model.addAttribute("customer", customerFromDb);
        return "customerView";
    }

    @GetMapping("/all")
    public String all(Model model) {
        List<Customer> customerList = (List<Customer>) repository.findAll();
        model.addAttribute("list", customerList);
        return "allCustomerView";
    }

    @PostMapping("/customer")
    public String create(@RequestBody CustomerDto customerDto) {
        repository.save(CustomerDto.map(customerDto));
        return "customerView";
    }
}
