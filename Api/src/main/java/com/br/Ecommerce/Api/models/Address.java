package com.br.Ecommerce.Api.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

/**
 * Representa um endereço físico.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // CEP - código postal, geralmente com 8 caracteres no Brasil.
    @NotBlank
    @Size(min = 8, max = 8, message = "O CEP deve conter 8 caracteres")
    private int cep;

    // Nome da rua.
    private String street;

    // Número da casa.
    private String number;

    // Cidade.
    private String city;

    // Bairro.
    private String district;

    // Estado.
    private String state;

    // Informações adicionais sobre o endereço.
    private String complement;
}
