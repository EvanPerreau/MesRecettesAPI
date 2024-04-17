package fr.evanperreau.MesRecettesAPI.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "role_permission")
public class RolePermission {

    @Id
    @ManyToOne
    @JoinColumn(name = "role_name", nullable = false)
    private Role role;

    @Id
    @ManyToOne
    @JoinColumn(name = "permission_name", nullable = false)
    private Permission permission;
}

