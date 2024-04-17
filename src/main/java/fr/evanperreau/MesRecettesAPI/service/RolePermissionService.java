package fr.evanperreau.MesRecettesAPI.service;

import fr.evanperreau.MesRecettesAPI.model.RolePermission;
import fr.evanperreau.MesRecettesAPI.model.RolePermissionId;
import fr.evanperreau.MesRecettesAPI.repository.RolePermissionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class RolePermissionService {

    private RolePermissionRepository rolePermissionRepository;

    public Iterable<RolePermission> getAllRolePermissions() {
        return rolePermissionRepository.findAll();
    }

    public Optional<RolePermission> getRolePermissionById(RolePermissionId id) {
        return rolePermissionRepository.findById(id);
    }

    public RolePermission saveRolePermission(RolePermission rolePermission) {
        return rolePermissionRepository.save(rolePermission);
    }

    public void deleteRolePermissionById(RolePermissionId id) {
        rolePermissionRepository.deleteById(id);
    }
}
