package com.ecommerce.ecommerce.controller;


import com.ecommerce.ecommerce.entity.Product;
import com.ecommerce.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class ProductController {

    @Autowired
    ProductRepository repository;

    @GetMapping("/products")
    public String all(Model model){
        List<Product> productList = (List<Product>)repository.findAll();
        model.addAttribute("productList",productList);
        return "productsView";
    }
}
