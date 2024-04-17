package fr.evanperreau.MesRecettesAPI.repository;

import fr.evanperreau.MesRecettesAPI.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
