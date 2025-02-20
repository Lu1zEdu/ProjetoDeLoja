package com.br.Ecommerce.Api.models;

import com.br.Ecommerce.Api.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa um carrinho de compras de um usuário.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Cada carrinho está associado a um usuário.
    @OneToOne
    private User user;

    // Lista de produtos adicionados ao carrinho.
    @ManyToMany
    private List<Product> products = new ArrayList<>();

    // Status de pagamento relacionado ao carrinho.
    @Enumerated(EnumType.STRING)
    private PaymentStatus status;

    // Data e hora em que o pagamento foi realizado (se aplicável).
    private LocalDateTime paymentDate;

    /**
     * Adiciona um produto ao carrinho.
     * @param product O produto a ser adicionado.
     */
    public void addProduct(Product product){
        products.add(product);
    }

    /**
     * Exibe a lista de produtos no carrinho.
     */
    public void listCart(){
        products.forEach(System.out::println);
    }
}
