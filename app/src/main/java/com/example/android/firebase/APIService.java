package com.example.android.firebase;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIService {
    @POST("survey")
    @FormUrlEncoded
    Call<Post> savePost(@Field("q1") String Q1,
                        @Field("q2") String Q2,
                        @Field("q3") String Q3,
                        @Field("q4") String Q4);

}
