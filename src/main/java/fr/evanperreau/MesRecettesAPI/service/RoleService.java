package fr.evanperreau.MesRecettesAPI.service;

import fr.evanperreau.MesRecettesAPI.model.Role;
import fr.evanperreau.MesRecettesAPI.repository.RoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class RoleService {

    private RoleRepository roleRepository;

    public Iterable<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public Optional<Role> getRoleByName(String name) {
        return roleRepository.findById(name);
    }

    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    public void deleteRoleByName(String name) {
        roleRepository.deleteById(name);
    }
}
