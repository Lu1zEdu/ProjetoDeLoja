package com.br.Ecommerce.Api.request;

import com.br.Ecommerce.Api.models.Review;
import com.br.Ecommerce.Api.models.Category;
import com.br.Ecommerce.Api.models.Seller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductRequest {
    private String title;
    private String description;
    private BigDecimal price;
    private String type;
    private String brand;
    private Integer stock;
    private Boolean availability;
    private String sku;
    private List<String> images = new ArrayList<>();
    private Integer discount;
    private Seller seller;
    private Category category;
    private List<Review> assessments;

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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Review> getAssessments() {
        return assessments;
    }

    public void setAssessments(List<Review> assessments) {
        this.assessments = assessments;
    }
}