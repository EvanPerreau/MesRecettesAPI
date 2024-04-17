package fr.evanperreau.MesRecettesAPI.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "role_permission")
public class RolePermission {

    @EmbeddedId
    private RolePermissionId id;

    @ManyToOne
    @MapsId("roleName")
    @JoinColumn(name = "role_name", nullable = false)
    private Role role;

    @ManyToOne
    @MapsId("permissionName")
    @JoinColumn(name = "permission_name", nullable = false)
    private Permission permission;
}