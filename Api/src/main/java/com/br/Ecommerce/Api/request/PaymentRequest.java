package com.br.Ecommerce.Api.request;

import com.br.Ecommerce.Api.enums.TypePayment;

import java.math.BigDecimal;
import java.util.Date;

public class PaymentRequest {
    private String paymentMethod;
    private BigDecimal amount;
    private TypePayment typePayment;
    private boolean verificationPaygament;
    private Date datePaygament;

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public TypePayment getTypePayment() {
        return typePayment;
    }

    public void setTypePayment(TypePayment typePayment) {
        this.typePayment = typePayment;
    }

    public boolean isVerificationPaygament() {
        return verificationPaygament;
    }

    public void setVerificationPaygament(boolean verificationPaygament) {
        this.verificationPaygament = verificationPaygament;
    }

    public Date getDatePaygament() {
        return datePaygament;
    }

    public void setDatePaygament(Date datePaygament) {
        this.datePaygament = datePaygament;
    }
}
