package com.br.Ecommerce.Api.models;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(min)
    private String cep;
    private String rua;
    private String numero;
    private String cidade;
    private String estado;
    private String pais;


}