package fr.evanperreau.MesRecettesAPI.service;


import fr.evanperreau.MesRecettesAPI.model.Recipe;
import fr.evanperreau.MesRecettesAPI.repository.RecipeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class RecipeService {

    private RecipeRepository recipeRepository;

    public Iterable<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }

    public Optional<Recipe> getRecipeById(Long id) {
        return recipeRepository.findById(id);
    }

    public Recipe saveRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    public void deleteRecipeById(Long id) {
        recipeRepository.deleteById(id);
    }
}
