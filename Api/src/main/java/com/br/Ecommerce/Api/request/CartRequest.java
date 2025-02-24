package com.br.Ecommerce.Api.request;

import com.br.Ecommerce.Api.enums.PaymentStatus;
import com.br.Ecommerce.Api.models.Product;
import com.br.Ecommerce.Api.models.User;

import java.time.LocalDateTime;
import java.util.List;

public class CartRequest {
    private User user;
    private List<Product> products;
    private PaymentStatus status;
    private LocalDateTime paymentDate;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }
}
