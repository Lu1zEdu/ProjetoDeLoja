package com.br.Ecommerce.Api.dto;

import com.br.Ecommerce.Api.models.Product;
import com.br.Ecommerce.Api.models.User;

import java.util.List;

public class CartRequest {
    private User user;
    private List<Product> products;
}
