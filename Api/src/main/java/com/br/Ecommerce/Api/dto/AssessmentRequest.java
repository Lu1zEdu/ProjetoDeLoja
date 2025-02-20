package com.br.Ecommerce.Api.dto;

import com.br.Ecommerce.Api.models.Product;

import java.time.LocalDate;

public class AssessmentRequest {
    private String title;
    private String description;
    private LocalDate dateAvailable;
    private Product product;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateAvailable() {
        return dateAvailable;
    }

    public void setDateAvailable(LocalDate dateAvailable) {
        this.dateAvailable = dateAvailable;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
