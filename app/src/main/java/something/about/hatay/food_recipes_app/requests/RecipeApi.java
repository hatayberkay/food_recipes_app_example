package something.about.hatay.food_recipes_app.requests;

import androidx.lifecycle.LiveData;
import retrofit2.http.GET;
import retrofit2.http.Query;
import something.about.hatay.food_recipes_app.requests.responses.ApiResponse;
import something.about.hatay.food_recipes_app.requests.responses.RecipeResponse;
import something.about.hatay.food_recipes_app.requests.responses.RecipeSearchResponse;

public interface RecipeApi {

    // SEARCH
    @GET("api/search")
    LiveData<ApiResponse<RecipeSearchResponse>> searchRecipe(
            @Query("key") String key,
            @Query("q") String query,
            @Query("page") String page
    );

    // GET RECIPE REQUEST
    @GET("api/get")
    LiveData<ApiResponse<RecipeResponse>> getRecipe(
            @Query("key") String key,
            @Query("rId") String recipe_id
    );
}
