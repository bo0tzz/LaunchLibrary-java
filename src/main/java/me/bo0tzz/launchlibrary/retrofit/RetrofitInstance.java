package me.bo0tzz.launchlibrary.retrofit;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import me.bo0tzz.launchlibrary.retrofit.api.*;
import okhttp3.*;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    public static final String API_URL = "https://launchlibrary.net/1.3/";
    private Retrofit retrofit;
    private AgencyAPI agencyAPI;
    private LaunchAPI launchAPI;
    private LocationAPI locationAPI;
    private MissionAPI missionAPI;
    private PadAPI padAPI;
    private RocketAPI rocketAPI;

    public RetrofitInstance() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder().build();

        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(API_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create());
        retrofit = builder.build();
    }

    public AgencyAPI agencyAPI() {
        return agencyAPI == null ? retrofit.create(AgencyAPI.class) : agencyAPI;
    }
    
    public LaunchAPI launchAPI() {
        return launchAPI == null ? retrofit.create(LaunchAPI.class) : launchAPI;
    }

    public LocationAPI locationAPI() {
        return locationAPI == null ? retrofit.create(LocationAPI.class) : locationAPI;
    }

    public MissionAPI missionAPI() {
        return missionAPI == null ? retrofit.create(MissionAPI.class) : missionAPI;
    }

    public PadAPI padAPI() {
        return padAPI == null ? retrofit.create(PadAPI.class) : padAPI;
    }

    public RocketAPI rocketAPI() {
        return rocketAPI == null ? retrofit.create(RocketAPI.class) : rocketAPI;
    }
    
}
