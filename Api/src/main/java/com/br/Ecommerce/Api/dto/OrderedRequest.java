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
}
