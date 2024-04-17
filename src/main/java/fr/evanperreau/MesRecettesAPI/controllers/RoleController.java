package fr.evanperreau.MesRecettesAPI.controllers;

import fr.evanperreau.MesRecettesAPI.model.Role;
import fr.evanperreau.MesRecettesAPI.service.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/roles")
@AllArgsConstructor
public class RoleController {

    private RoleService roleService;

    @GetMapping
    public Iterable<Role> getAllRoles() {
        return roleService.getAllRoles();
    }

    @GetMapping("/{name}")
    public Role getRoleByName(@PathVariable String name) {
        return roleService.getRoleByName(name);
    }

    @PostMapping
    public Role createRole(@RequestBody Role role) {
        return roleService.saveRole(role);
    }

    @DeleteMapping("/{name}")
    public void deleteRole(@PathVariable String name) {
        roleService.deleteRoleByName(name);
    }
}
