package me.bo0tzz.launchlibrary.retrofit.api;

import io.reactivex.Observable;
import me.bo0tzz.launchlibrary.models.page.RocketPage;
import me.bo0tzz.launchlibrary.retrofit.Mode;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface RocketAPI {

    @GET("rocket")
    Observable<RocketPage> getRockets(@QueryMap Map<String, String> parameters);

    @GET("rocket/{id}")
    Observable<RocketPage> getRocketsById(@Path("id") Integer id,
                                          @Query("offset") Integer offset,
                                          @Query("mode") Mode mode);

    @GET("rocket/{name}")
    Observable<RocketPage> getRocketsByName(@Path("name") String name,
                                            @Query("offset") Integer offset,
                                            @Query("mode") Mode mode);

}
