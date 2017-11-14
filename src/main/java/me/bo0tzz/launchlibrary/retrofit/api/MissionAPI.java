package me.bo0tzz.launchlibrary.retrofit.api;

import io.reactivex.Observable;
import me.bo0tzz.launchlibrary.models.page.MissionPage;
import me.bo0tzz.launchlibrary.retrofit.Mode;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface MissionAPI {

    @GET("mission")
    Observable<MissionPage> getMissions(@QueryMap Map<String, String> parameters);

    @GET("mission/{id}")
    Observable<MissionPage> getMissionsById(@Path("id") Integer id,
                                            @Query("offset") Integer offset,
                                            @Query("mode") Mode mode);

    @GET("mission/{name}")
    Observable<MissionPage> getMissionsByName(@Path("name") String name,
                                              @Query("offset") Integer offset,
                                              @Query("mode") Mode mode);

}
