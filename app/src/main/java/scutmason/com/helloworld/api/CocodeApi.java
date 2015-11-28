package scutmason.com.helloworld.api;

import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;
import rx.Observable;
import scutmason.com.helloworld.model.Categocies;
import scutmason.com.helloworld.model.LastestModel;
import scutmason.com.helloworld.model.TopicDetail;

/**
 * Created by jiajun on 2015/9/22.
 */
public interface CocodeApi {
    @GET("latest.json")
    Observable<LastestModel> getLatest(@Query("page") int page);

    @GET("categories.json")
    Observable<Categocies> getCategories();

    @GET("c/{category}.json")
    Observable<LastestModel> getTopic(@Path("category") String category, @Query("page") int page);

    @GET("t/{id}.json")
    Observable<TopicDetail> getTopicDetail(@Path("id") int id, @Query("page") int page);

}
