package scutmason.com.helloworld.api;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;
import scutmason.com.helloworld.model.Categocies;
import scutmason.com.helloworld.model.LastestModel;

/**
 * Created by jiajun on 2015/9/22.
 */
public interface CocodeApi {
    @GET("latest.json")
    Observable<LastestModel> getLatest();
    @GET("categories.json")
    Observable<Categocies> getCategories();
    @GET("c/{category}.json")
    Observable<LastestModel> getTopic(@Path("category") String category);

    @GET("t/{category}/{id}.json")
    Observable<LastestModel> getTopicDetail(@Path("category") String category,@Path("id") int id);

}
