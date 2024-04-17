package fr.evanperreau.MesRecettesAPI.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
@Embeddable
public class RecipeCategoryId implements Serializable {

    @Column(name = "recipe_id")
    private Long recipeId;

    @Column(name = "category_id")
    private Long categoryId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeCategoryId that = (RecipeCategoryId) o;
        return Objects.equals(recipeId, that.recipeId) &&
                Objects.equals(categoryId, that.categoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeId, categoryId);
    }
}
