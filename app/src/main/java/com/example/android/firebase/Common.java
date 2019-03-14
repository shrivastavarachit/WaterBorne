package com.example.android.firebase;



public class Common {
    private static final String Api_Url="http://server-api-3.appspot.com";
    public static IGoogleApiService getGoogleApiService(){
        return RetrofitClient.getClient(Api_Url).create(IGoogleApiService.class);

    }
}