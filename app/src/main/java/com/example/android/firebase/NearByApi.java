package com.example.android.firebase;

import com.example.android.firebase.Model.NearbySearch;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NearByApi {
    @GET("api/place/nearbysearch/json?sensor=true&key=AIzaSyAoze5KCvMyAtpRC0euoyCxcT3v1oYLcts")
    Call<NearbySearch> getNearbyPlaces(@Query("type") String type, @Query("location") String location, @Query("radius") int radius);
}
