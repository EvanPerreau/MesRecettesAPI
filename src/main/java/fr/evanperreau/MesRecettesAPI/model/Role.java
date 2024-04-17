package fr.evanperreau.MesRecettesAPI.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "role")
public class Role {

    @Id
    @Column(name = "name", length = 25, nullable = false)
    private String name;

    @Column(name = "description", length = 255)
    private String description;
}
