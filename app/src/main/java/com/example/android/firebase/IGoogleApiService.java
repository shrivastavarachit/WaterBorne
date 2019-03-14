package com.example.android.firebase;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IGoogleApiService {

    String BASE_URL="http://server-api-7.appspot.com";
    @GET(".")
    Call<List<Outbreak>> getNearbyOutbreaks();
}
