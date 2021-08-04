package something.about.hatay.food_recipes_app.util;

import android.util.Log;

import java.util.List;

import something.about.hatay.food_recipes_app.models.Recipe;

public class Testing {

    public static void printRecipes(List<Recipe> list, String tag){
        for(Recipe recipe: list){
            Log.d(tag, "onChanged: " + recipe.getTitle());
        }
    }
}
