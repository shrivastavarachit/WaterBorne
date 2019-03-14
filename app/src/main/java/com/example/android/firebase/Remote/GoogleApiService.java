package com.example.android.firebase.Remote;

import com.example.android.firebase.Model.NearbySearch;
import com.google.android.gms.common.api.GoogleApiClient;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface GoogleApiService {
    @GET
    Call<NearbySearch> getNearbySearch(@Url String url);

}
