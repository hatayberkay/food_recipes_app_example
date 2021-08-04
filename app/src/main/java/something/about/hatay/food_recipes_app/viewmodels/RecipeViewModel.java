package something.about.hatay.food_recipes_app.viewmodels;


import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import something.about.hatay.food_recipes_app.models.Recipe;
import something.about.hatay.food_recipes_app.repositories.RecipeRepository;
import something.about.hatay.food_recipes_app.util.Resource;


public class RecipeViewModel extends AndroidViewModel {

    private RecipeRepository recipeRepository;

    public RecipeViewModel(@NonNull Application application) {
        super(application);
        recipeRepository = RecipeRepository.getInstance(application);
    }

    public LiveData<Resource<Recipe>> searchRecipeApi(String recipeId){
        return recipeRepository.searchRecipesApi(recipeId);
    }
}





















