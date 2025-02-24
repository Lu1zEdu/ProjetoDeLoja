package com.br.Ecommerce.Api.request;

import com.br.Ecommerce.Api.models.Product;

import java.util.ArrayList;
import java.util.List;

public class CategoryRequest {
    private String name;
    private String description;
    private List<Product> products = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
