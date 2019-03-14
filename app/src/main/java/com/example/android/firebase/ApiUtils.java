package com.example.android.firebase;

class ApiUtils {
    private ApiUtils(){}
    public static final String BASE_URL="http://server-api-3.appspot.com/";
    public static APIService getAPIService(){
        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}
