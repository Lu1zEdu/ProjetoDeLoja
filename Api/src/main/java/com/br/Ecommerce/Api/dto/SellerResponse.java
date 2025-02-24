package com.br.Ecommerce.Api.dto;

import com.br.Ecommerce.Api.models.Product;

import java.util.List;

public record SellerResponse(String storeName, int cnpj, String phone, List<Product> products) {
}
