package me.bo0tzz.launchlibrary.retrofit.api;


import io.reactivex.Observable;
import me.bo0tzz.launchlibrary.models.page.LaunchPage;
import me.bo0tzz.launchlibrary.retrofit.Mode;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface LaunchAPI {

    @GET("launch")
    Observable<LaunchPage> getLaunches(@QueryMap Map<String, String> parameters);

    @GET("launch/{id}")
    Observable<LaunchPage> getLaunchesById(@Path("id") Integer id,
                                           @Query("offset") Integer offset,
                                           @Query("mode") Mode mode);

    @GET("launch/{name}")
    Observable<LaunchPage> getLaunchesByName(@Path("name") String name,
                                             @Query("offset") Integer offset,
                                             @Query("mode") Mode mode);

    @GET("launch/next/{n}")
    Observable<LaunchPage> getNextNLaunches(@Path("n") Integer n,
                                            @Query("offset") Integer offset,
                                            @Query("mode") Mode mode);

    @GET("launch/{startDate}/{endDate}")
    Observable<LaunchPage> getLaunchesBetween(@Path("startDate") String startDate,
                                              @Path("endDate") String endDate,
                                              @Query("offset") Integer offset,
                                              @Query("mode") Mode mode);

    @GET("launch/{startDate}")
    Observable<LaunchPage> getLaunchesAfter(@Path("startDate") String startDate,
                                            @Query("offset") Integer offset,
                                            @Query("mode") Mode mode);

}
