package com.br.Ecommerce.Api.models;

import com.br.Ecommerce.Api.enums.TypePayment;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.core.annotation.Order;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String paymentMethod;
    private BigDecimal amount;
    private TypePayment typePayment;
    private boolean paygamentVerification;

    @OneToOne
    private Order order;


}