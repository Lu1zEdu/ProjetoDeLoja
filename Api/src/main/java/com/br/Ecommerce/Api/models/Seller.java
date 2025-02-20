package com.br.Ecommerce.Api.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa um vendedor na plataforma de e-commerce.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Nome da loja do vendedor.
    private String storeName;

    // Número de identificação fiscal (por exemplo, CNPJ).
    private String cnpj;

    // E-mail do vendedor.
    private String email;

    // Telefone de contato.
    private String phone;

    // Lista de produtos oferecidos pelo vendedor.
    @OneToMany(mappedBy = "seller", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Product> products = new ArrayList<>();
}
