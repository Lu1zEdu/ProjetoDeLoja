package com.br.Ecommerce.Api.dto;

import com.br.Ecommerce.Api.enums.OrderStatus;
import com.br.Ecommerce.Api.models.Product;
import com.br.Ecommerce.Api.models.User;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class OrderedRequest {
    private User user;
    private List<Product> products;
    private BigDecimal totalAmount;
    private LocalDate orderDate;
    private OrderStatus status;

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

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
