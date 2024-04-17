package fr.evanperreau.MesRecettesAPI.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "permission")
public class Permission {

    @Id
    @Column(name = "name", length = 125, nullable = false)
    private String name;

    @Column(name = "priority", nullable = false)
    private int priority;

    @Column(name = "description", length = 255)
    private String description;
}

