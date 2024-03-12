package com.ecommerce.ecommerce.dto;

import com.ecommerce.ecommerce.entity.Product;

import java.math.BigDecimal;

public record ProductDto(String name, BigDecimal price, Long id) {
    public static ProductDto map(Product product){
        return new ProductDto(product.getName(), product.getPrice(), product.getId());
    }

    public static Product map(ProductDto productDto){
        Product product = new Product();
        product.setName(productDto.name);
        product.setPrice(productDto.price);
        product.setId(productDto.id);
        return product;
    }
}
