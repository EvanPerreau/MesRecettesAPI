package fr.evanperreau.MesRecettesAPI.repository;

import fr.evanperreau.MesRecettesAPI.model.RecipeCategory;
import fr.evanperreau.MesRecettesAPI.model.RecipeCategoryId;
import org.springframework.data.repository.CrudRepository;

public interface RecipeCategoryRepository extends CrudRepository<RecipeCategory, RecipeCategoryId> {
}