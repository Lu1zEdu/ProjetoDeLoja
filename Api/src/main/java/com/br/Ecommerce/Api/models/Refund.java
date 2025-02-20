package com.br.Ecommerce.Api.models;

import com.br.Ecommerce.Api.enums.RefundStatus;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Representa uma solicitação de reembolso para um pedido.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Refund {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Pedido associado para o qual o reembolso é solicitado.
    @OneToOne
    private Order order;

    // Status do reembolso.
    @Enumerated(EnumType.STRING)
    private RefundStatus status;

    // Valor a ser reembolsado.
    private BigDecimal refundAmount;

    // Data e hora em que o reembolso foi solicitado.
    private LocalDateTime requestDate;
}
