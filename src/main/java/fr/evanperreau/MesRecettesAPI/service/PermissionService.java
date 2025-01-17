package fr.evanperreau.MesRecettesAPI.service;

import fr.evanperreau.MesRecettesAPI.exception.ResourceNotFoundException;
import fr.evanperreau.MesRecettesAPI.model.Permission;
import fr.evanperreau.MesRecettesAPI.repository.PermissionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PermissionService {

    private PermissionRepository permissionRepository;

    public Iterable<Permission> getAllPermissions() {
        return permissionRepository.findAll();
    }

    public Permission getPermissionByName(String name) {
        return permissionRepository.findById(name)
                .orElseThrow(() -> new ResourceNotFoundException("Permission", "name", name));
    }

    public Permission savePermission(Permission permission) {
        return permissionRepository.save(permission);
    }

    public void deletePermissionByName(String name) {
        permissionRepository.deleteById(name);
    }
}
