package com.br.Ecommerce.Api.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa uma avaliação de produto feita por um cliente.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Título da avaliação.
    private String title;

    // Descrição detalhada da avaliação.
    private String description;

    // Data e hora em que a avaliação foi postada.
    private LocalDateTime reviewDate;

    //Nota da Avalição
    @Size(min = 0, max = 5)
    private int note;

    // O produto avaliado.
    @ManyToOne
    private Product product;

    //A avaliação precisa de um usuario
    @ManyToOne
    private User user;

    // Lista de URLs de imagens.
    @ElementCollection
    private List<String> images = new ArrayList<>();

    /**
     * Adiciona uma imagem ao produto.
     * @param image A URL da imagem a ser adicionada.
     */
    public void addImage(String image){
        images.add(image);
    }

    /**
     * Exibe todas as imagens do produto.
     */
    public void listImages() {
        images.forEach(System.out::println);
    }

}
