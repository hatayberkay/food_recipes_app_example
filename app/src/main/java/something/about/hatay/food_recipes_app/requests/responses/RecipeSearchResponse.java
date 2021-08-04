package something.about.hatay.food_recipes_app.requests.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import androidx.annotation.Nullable;
import something.about.hatay.food_recipes_app.models.Recipe;

public class RecipeSearchResponse {

    @SerializedName("count")
    @Expose()
    private int count;

    @SerializedName("recipes")
    @Expose()
    private List<Recipe> recipes;

    @SerializedName("error")
    @Expose()
    private String error;

    public String getError() {
        return error;
    }

    public int getCount() {
        return count;
    }

    @Nullable
    public List<Recipe> getRecipes() {
        return recipes;
    }

    @Override
    public String toString() {
        return "RecipeSearchResponse{" +
                "count=" + count +
                ", recipes=" + recipes +
                ", error='" + error + '\'' +
                '}';
    }
}
