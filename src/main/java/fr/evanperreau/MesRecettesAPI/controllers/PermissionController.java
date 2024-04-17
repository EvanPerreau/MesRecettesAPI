package fr.evanperreau.MesRecettesAPI.controllers;

import fr.evanperreau.MesRecettesAPI.model.Permission;
import fr.evanperreau.MesRecettesAPI.service.PermissionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/permissions")
@AllArgsConstructor
public class PermissionController {

    private PermissionService permissionService;

    @GetMapping
    public Iterable<Permission> getAllPermissions() {
        return permissionService.getAllPermissions();
    }

    @GetMapping("/{name}")
    public Permission getPermissionByName(@PathVariable String name) {
        return permissionService.getPermissionByName(name);
    }

    @PostMapping
    public Permission createPermission(@RequestBody Permission permission) {
        return permissionService.savePermission(permission);
    }

    @DeleteMapping("/{name}")
    public void deletePermission(@PathVariable String name) {
        permissionService.deletePermissionByName(name);
    }
}
