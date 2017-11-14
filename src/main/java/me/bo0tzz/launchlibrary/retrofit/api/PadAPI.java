package me.bo0tzz.launchlibrary.retrofit.api;

import io.reactivex.Observable;
import me.bo0tzz.launchlibrary.models.page.PadPage;
import me.bo0tzz.launchlibrary.retrofit.Mode;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface PadAPI {

    @GET("pad")
    Observable<PadPage> getPads(@QueryMap Map<String, String> parameters);

    @GET("pad/{id}")
    Observable<PadPage> getPadsById(@Path("id") Integer id,
                                    @Query("offset") Integer offset,
                                    @Query("mode") Mode mode);

    @GET("pad/{name}")
    Observable<PadPage> getPadsByName(@Path("name") String name,
                                      @Query("offset") Integer offset,
                                      @Query("mode") Mode mode);

}
