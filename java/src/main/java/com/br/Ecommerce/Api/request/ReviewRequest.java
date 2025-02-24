package com.br.Ecommerce.Api.request;

import com.br.Ecommerce.Api.models.Product;
import com.br.Ecommerce.Api.models.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ReviewRequest {
    private String title;
    private String description;
    private LocalDateTime reviewDate;
    private int note;
    private Product product;
    private User user;
    private List<String> images = new ArrayList<>();


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

    public LocalDateTime getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(LocalDateTime reviewDate) {
        this.reviewDate = reviewDate;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }
}
