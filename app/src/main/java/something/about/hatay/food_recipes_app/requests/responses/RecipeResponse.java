package something.about.hatay.food_recipes_app.requests.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import androidx.annotation.Nullable;
import something.about.hatay.food_recipes_app.models.Recipe;

public class RecipeResponse {

    @SerializedName("recipe")
    @Expose()
    private Recipe recipe;

    @SerializedName("error")
    @Expose()
    private String error;

    public String getError() {
        return error;
    }

    @Nullable
    public Recipe getRecipe(){
        return recipe;
    }

    @Override
    public String toString() {
        return "RecipeResponse{" +
                "recipe=" + recipe +
                ", error='" + error + '\'' +
                '}';
    }
}
