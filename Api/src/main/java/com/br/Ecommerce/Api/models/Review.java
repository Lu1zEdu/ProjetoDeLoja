package com.br.Ecommerce.Api.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

/**
 * Representa uma avaliação de produto feita por um cliente.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Título da avaliação.
    private String title;

    // Descrição detalhada da avaliação.
    private String description;

    // Data e hora em que a avaliação foi postada.
    private LocalDateTime reviewDate;

    // O produto avaliado.
    @ManyToOne
    private Product product;
}
