package fr.evanperreau.MesRecettesAPI.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class RolePermissionId implements Serializable {

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "permission_name")
    private String permissionName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RolePermissionId that = (RolePermissionId) o;
        return roleName.equals(that.roleName) &&
                permissionName.equals(that.permissionName);
    }

    @Override
    public int hashCode() {
        return roleName.hashCode() + permissionName.hashCode();
    }
}
