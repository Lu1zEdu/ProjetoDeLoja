package com.br.Ecommerce.Api.models;

import jakarta.persistence.*;
import lombok.*;
import com.br.Ecommerce.Api.enums.TypeCategoty;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private TypeCategoty typeCategoty;
}