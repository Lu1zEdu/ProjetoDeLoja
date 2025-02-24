package com.br.Ecommerce.Api.request;

import com.br.Ecommerce.Api.models.Product;

import java.util.ArrayList;
import java.util.List;

public class SellerRequest {
    private String storeName;
    private int cnpj;
    private String phone;
    private List<Product> products = new ArrayList<>();

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
