package com.br.Ecommerce.Api.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa um produto no sistema de e-commerce.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Título do produto.
    @Size(min = 5)
    private String title;

    // Descrição detalhada.
    @Size(min = 10)
    private String description;

    // Preço do produto.
    private BigDecimal price;

    // Tipo/categoria como string (se necessário).
    private String type;

    // Marca do produto.
    private String brand;

    // Quantidade disponível em estoque.
    private Integer stock;

    // Indica a disponibilidade do produto.
    private Boolean availability;

    // Identificador único SKU.
    private String sku;

    // Lista de URLs de imagens.
    @ElementCollection
    private List<String> images = new ArrayList<>();

    // Percentual de desconto (se aplicável).
    private Integer discount;

    // Vendedor que oferece o produto.
    @ManyToOne
    private Seller seller;

    // Categoria do produto.
    @ManyToOne
    private Category category;

    // Lista de avaliações.
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Review> reviews = new ArrayList<>();

    /**
     * Adiciona uma avaliação ao produto.
     * @param review A avaliação a ser adicionada.
     */
    public void addReview(Review review){
        reviews.add(review);
    }

    /**
     * Exibe todas as avaliações do produto.
     */
    public void listReviews() {
        reviews.forEach(System.out::println);
    }
}
