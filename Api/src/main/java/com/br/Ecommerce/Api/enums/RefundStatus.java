package com.br.Ecommerce.Api.enums;

/**
 * Enum que representa os possíveis status de um reembolso.
 */
public enum RefundStatus {
    REQUESTED, // Enum que representa os possíveis status de um reembolso.
    APPROVED,  // Reembolso aprovado pela administração.
    REJECTED,  // Reembolso rejeitado.
    PROCESSED; // Reembolso já processado.
}
