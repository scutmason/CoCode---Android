package scutmason.com.helloworld;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;

import retrofit.CallAdapter;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;
import scutmason.com.helloworld.api.CocodeApi;

/**
 * 2015-08-07T03:57:47.229Z
 * Created by drakeet on 8/9/15.
 * modified by jiajun on 9/22/15
 */
public class CocodeRetrofit {

    final CocodeApi service;

    final static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
        .serializeNulls()
        .create();

    CocodeRetrofit() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://cocode.cc/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        service = retrofit.create(CocodeApi.class);
    }

    public CocodeApi getService() {
        return service;
    }
}
