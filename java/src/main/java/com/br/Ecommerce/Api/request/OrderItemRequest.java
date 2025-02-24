package com.br.Ecommerce.Api.request;

import com.br.Ecommerce.Api.models.Order;
import com.br.Ecommerce.Api.models.Product;

import java.math.BigDecimal;

public class OrderItemRequest {
    private Product product;
    private Integer quantity;
    private BigDecimal unitPrice;
    private BigDecimal subtotal;
    private Order order;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
