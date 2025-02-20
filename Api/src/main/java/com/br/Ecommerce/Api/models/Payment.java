package com.br.Ecommerce.Api.models;

import com.br.Ecommerce.Api.enums.TypePayment;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.core.annotation.Order;

import java.math.BigDecimal;
import java.util.Date;

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
    private boolean verificationPaygament;
    private Date datePaygament;

    @OneToOne
    private Order order;

    public void managerPayment(){
        if(typePayment == TypePayment.PIX){
            if (verificationPaygament == true ){

            }else{
                return;
            }

        }else if (typePayment == TypePayment.DEBITO) {
            if (verificationPaygament == true){

            }else{
                return;
            }
        }else if (typePayment == TypePayment.CREDITO) {
            if (verificationPaygament == true){

            }else{
                return;
            }
        }else if (typePayment == TypePayment.BOLETO) {
            if (verificationPaygament == true){

            }else {
                return;
            }

        }else {
            return;
        }
    }


}