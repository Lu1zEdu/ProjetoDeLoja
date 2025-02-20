package com.br.Ecommerce.Api.models;

import com.br.Ecommerce.Api.enums.CardBrand;
import jakarta.persistence.*;
import lombok.*;

/**
 * Representa o cartão de crédito de um usuário.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Número do cartão de crédito (deve ser armazenado de forma segura).
    private String number;

    // Nome do titular do cartão.
    private String cardholderName;

    // Data de validade no formato MM/AA.
    private String expirationDate;

    // Código CVV.
    private String cvv;

    // Bandeira do cartão (por exemplo, VISA, MASTERCARD).
    @Enumerated(EnumType.STRING)
    private CardBrand brand;
}
