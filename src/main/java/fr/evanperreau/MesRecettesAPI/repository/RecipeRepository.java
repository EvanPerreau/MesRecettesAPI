package fr.evanperreau.MesRecettesAPI.repository;

import fr.evanperreau.MesRecettesAPI.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
