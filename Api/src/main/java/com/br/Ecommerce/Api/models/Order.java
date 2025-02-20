package com.br.Ecommerce.Api.models;

import com.br.Ecommerce.Api.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa um pedido realizado por um cliente.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders") // 'order' é uma palavra reservada em alguns bancos de dados
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // O cliente que realizou o pedido.
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User customer;

    // Lista de itens incluídos no pedido.
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderItem> orderItems = new ArrayList<>();

    // Valor total do pedido.
    private BigDecimal totalAmount;

    // Data e hora em que o pedido foi realizado.
    private LocalDateTime orderDate;

    // Status atual do pedido.
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    // Endereço de entrega do pedido.
    @OneToOne(cascade = CascadeType.ALL)
    private Address shippingAddress;

    // Pagamento associado a este pedido.
    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private Payment payment;
}
