package fr.evanperreau.MesRecettesAPI.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "recipe")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "owner", nullable = false)
    private User owner;

    @Column(name = "name", length = 255, nullable = false)
    private String name;

    @Column(name = "description", columnDefinition = "text")
    private String description;

    @Column(name = "ingredients", columnDefinition = "text")
    private String ingredients;

    @Column(name = "instructions", columnDefinition = "text")
    private String instructions;

    @Column(name = "cooking_time")
    private String cookingTime;

    @Column(name = "image")
    private byte[] image;

    @Column(name = "private", nullable = false)
    private boolean isPrivate;

    @Column(name = "creation_date", nullable = false)
    private LocalDateTime creationDate;

    @Column(name = "modification_date")
    private LocalDateTime modificationDate;
}
