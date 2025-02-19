package com.br.Ecommerce.Api.Models;

import com.vaadin.hilla.mappedtypes.Order;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.security.access.annotation.Secured;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    @Size(min = 7, max = 30 )
    private String password;
    private LocalDate birthDate;
    @Size(min =11 ,max = 11)
    private String cpf;
    @Size(min = 11, max = 11)
    private String phone;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    @OneToMany(mappedBy = "user")
    private List<Order> orders;
}
