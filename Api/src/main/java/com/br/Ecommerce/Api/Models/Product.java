package com.br.Ecommerce.Api.Models;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import jdk.jfr.Category;
import lombok.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(min = 5)
    private String title;
    @Size(min = 10)
    private String description;
    private BigDecimal price;
    private String type;
    private String brand;
    private Integer stock;
    private Boolean availability;
    private Integer discount;

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "product")
    private List<Assessment> assessments;
}