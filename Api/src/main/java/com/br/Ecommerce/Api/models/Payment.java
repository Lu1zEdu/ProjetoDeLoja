package com.br.Ecommerce.Api.models;

import com.br.Ecommerce.Api.enums.TypePayment;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Representa um pagamento realizado para um pedido.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Campo opcional para descrever o método de pagamento.
    private String paymentMethod;

    // Valor pago.
    private BigDecimal amount;

    // Tipo de pagamento (PIX, BOLETO, CREDITO, DEBITO).
    @Enumerated(EnumType.STRING)
    private TypePayment typePayment;

    // Indica se o pagamento foi verificado.
    private boolean verified;

    // Data e hora em que o pagamento foi realizado.
    private LocalDateTime paymentDate;


    // Pedido associado a este pagamento.
    @OneToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Order order;

    /**
     * Processa o pagamento.
     * Este método pode ser expandido para integrar com gateways de pagamento externos.
     */
    public void processPayment() {
        if (!verified) {
            System.out.println("Pagamento não verificado. Processamento cancelado.");
            return;
        }

        switch (typePayment) {
            case PIX:
                System.out.println("Processando pagamento via PIX...");
                break;
            case DEBITO:
                System.out.println("Processando pagamento via Débito...");
                break;
            case CREDITO:
                System.out.println("Processando pagamento via Crédito...");
                break;
            case BOLETO:
                System.out.println("Processando pagamento via Boleto...");
                break;
            default:
                System.out.println("Tipo de pagamento inválido.");
        }
    }
}
