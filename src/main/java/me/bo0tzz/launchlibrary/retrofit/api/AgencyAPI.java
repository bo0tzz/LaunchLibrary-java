package me.bo0tzz.launchlibrary.retrofit.api;

import io.reactivex.Observable;
import me.bo0tzz.launchlibrary.models.page.AgencyPage;
import me.bo0tzz.launchlibrary.retrofit.Mode;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface AgencyAPI {

    @GET("agency")
    Observable<AgencyPage> getAgencies(@QueryMap Map<String, String> parameters);

    @GET("agency/{id}")
    Observable<AgencyPage> getAgenciesById(@Path("id") Integer id,
                                           @Query("offset") Integer offset,
                                           @Query("mode") Mode mode);

    @GET("agency/{abbrev}")
    Observable<AgencyPage> getAgenciesByAbbreviation(@Path("abbrev") String abbreviation,
                                                     @Query("offset") Integer offset,
                                                     @Query("mode") Mode mode);

    @GET("agency")
    Observable<AgencyPage> getAgenciesByName(@Query("name") String name,
                                             @Query("offset") Integer offset,
                                             @Query("mode") Mode mode);

}
