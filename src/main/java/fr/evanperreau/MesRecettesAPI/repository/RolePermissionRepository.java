package fr.evanperreau.MesRecettesAPI.repository;

import fr.evanperreau.MesRecettesAPI.model.RolePermission;
import fr.evanperreau.MesRecettesAPI.model.RolePermissionId;
import org.springframework.data.repository.CrudRepository;

public interface RolePermissionRepository extends CrudRepository<RolePermission, RolePermissionId>{
}
