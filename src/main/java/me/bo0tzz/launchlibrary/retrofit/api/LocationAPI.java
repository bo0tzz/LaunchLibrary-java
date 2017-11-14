package me.bo0tzz.launchlibrary.retrofit.api;

import io.reactivex.Observable;
import me.bo0tzz.launchlibrary.models.page.LocationPage;
import me.bo0tzz.launchlibrary.retrofit.Mode;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface LocationAPI {

    @GET("location")
    Observable<LocationPage> getLocations(@QueryMap Map<String, String> parameters);

    @GET("location/{id}")
    Observable<LocationPage> getLocationsById(@Path("id") Integer id,
                                              @Query("offset") Integer offset,
                                              @Query("mode") Mode mode);

    @GET("location/{name}")
    Observable<LocationPage> getLocationsByName(@Path("name") String name,
                                                @Query("offset") Integer offset,
                                                @Query("mode") Mode mode);

}
