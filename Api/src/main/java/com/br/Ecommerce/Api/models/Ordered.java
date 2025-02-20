package com.br.Ecommerce.Api.models;

import com.br.Ecommerce.Api.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ordered {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToMany
    private List<Product> products;

    private BigDecimal totalAmount;
    private LocalDate orderDate;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}