package com.br.Ecommerce.Api.models;

import com.br.Ecommerce.Api.enums.TypeUser;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa um usuário do sistema.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Primeiro nome do usuário.
    private String firstName;

    // Sobrenome do usuário.
    private String lastName;

    // Endereço de e-mail.
    @Email
    private String email;

    // Senha do usuário (deve ser armazenada em formato criptografado).
    @NotBlank
    @Size(min = 7, max = 30)
    private String password;

    // Data de nascimento.
    private LocalDate birthDate;

    // CPF (Cadastro de Pessoas Físicas) com validação.
    @Size(min = 11, max = 11)
    private String cpf;

    // Número de telefone.
    @Size(min = 11, max = 11)
    private String phone;

    // Endereço associado.
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    // Lista de pedidos feitos pelo usuário.
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Order> orders = new ArrayList<>();

    // Tipo de usuário (ADMIN, CLIENTE, VENDEDOR).
    @Enumerated(EnumType.STRING)
    private TypeUser typeUser;
}
