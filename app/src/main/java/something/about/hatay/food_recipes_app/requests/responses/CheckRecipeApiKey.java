package something.about.hatay.food_recipes_app.requests.responses;

public class CheckRecipeApiKey {

    protected static boolean isRecipeApiKeyValid(RecipeSearchResponse response){
        return response.getError() == null;
    }

    protected static boolean isRecipeApiKeyValid(RecipeResponse response){
        return response.getError() == null;
    }
}
