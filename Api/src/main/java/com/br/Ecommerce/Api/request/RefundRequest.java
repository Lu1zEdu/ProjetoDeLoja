package com.br.Ecommerce.Api.request;

import com.br.Ecommerce.Api.enums.RefundStatus;
import com.br.Ecommerce.Api.models.Order;
import com.br.Ecommerce.Api.models.Payment;

import java.time.LocalDateTime;

public class RefundRequest {
    private Order order;
    private RefundStatus status;
    private LocalDateTime requestDate;
    private String refundReason;
    private Payment payment;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public RefundStatus getStatus() {
        return status;
    }

    public void setStatus(RefundStatus status) {
        this.status = status;
    }

    public LocalDateTime getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(LocalDateTime requestDate) {
        this.requestDate = requestDate;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
