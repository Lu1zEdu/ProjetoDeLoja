package com.br.Ecommerce.Api.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa uma categoria de produto.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Nome da categoria.
    private String name;

    // Descrição da categoria.
    private String description;

    // Lista de produtos associados a esta categoria.
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Product> products = new ArrayList<>();

    /**
     * Adiciona um produto à categoria.
     * @param product Produto a ser adicionado.
     */
    public void addProduct(Product product) {
        products.add(product);
    }

    /**
     * Lista todos os produtos da categoria.
     */
    public void listProducts() {
        products.forEach(System.out::println);
    }
}

