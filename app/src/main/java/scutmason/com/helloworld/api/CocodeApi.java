package scutmason.com.helloworld.api;

import retrofit.Call;
import retrofit.Callback;
import retrofit.http.GET;
import rx.Observable;
import scutmason.com.helloworld.model.LastestModel;

/**
 * Created by Administrator on 2015/9/22.
 */
public interface CocodeApi {
    @GET("/latest.json")
    public Call<LastestModel> getLatest();
}
