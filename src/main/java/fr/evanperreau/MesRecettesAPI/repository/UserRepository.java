package fr.evanperreau.MesRecettesAPI.repository;

import fr.evanperreau.MesRecettesAPI.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
