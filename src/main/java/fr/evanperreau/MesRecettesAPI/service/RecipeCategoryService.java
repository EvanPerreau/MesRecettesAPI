package fr.evanperreau.MesRecettesAPI.service;


import fr.evanperreau.MesRecettesAPI.model.RecipeCategory;
import fr.evanperreau.MesRecettesAPI.model.RecipeCategoryId;
import fr.evanperreau.MesRecettesAPI.repository.RecipeCategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class RecipeCategoryService {

    private RecipeCategoryRepository recipeCategoryRepository;

    public Iterable<RecipeCategory> getAllRecipeCategories() {
        return recipeCategoryRepository.findAll();
    }

    public Optional<RecipeCategory> getRecipeCategoryById(RecipeCategoryId id) {
        return recipeCategoryRepository.findById(id);
    }

    public RecipeCategory saveRecipeCategory(RecipeCategory recipeCategory) {
        return recipeCategoryRepository.save(recipeCategory);
    }

    public void deleteRecipeCategoryById(RecipeCategoryId id) {
        recipeCategoryRepository.deleteById(id);
    }
}
