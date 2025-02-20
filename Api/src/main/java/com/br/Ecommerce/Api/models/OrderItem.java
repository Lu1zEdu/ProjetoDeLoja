package com.br.Ecommerce.Api.models;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

/**
 * Representa um item dentro de um pedido.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // O produto sendo adquirido.
    @ManyToOne
    private Product product;

    // Quantidade solicitada.
    private Integer quantity;

    // Preço por unidade.
    private BigDecimal unitPrice;

    // Subtotal (unitPrice * quantity).
    private BigDecimal subtotal;

    // O pedido ao qual este item pertence.
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}
