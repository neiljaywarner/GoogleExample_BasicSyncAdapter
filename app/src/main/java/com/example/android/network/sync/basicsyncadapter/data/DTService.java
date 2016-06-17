package com.example.android.network.sync.basicsyncadapter.data;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by neil on 5/25/16.
 */
public interface DTService {

    public static String DISCIPLES_TODAY_BASE_URL = "http://disciplestoday.org/";

    @GET("component/k2/itemlist?format=json")
    Call<Feed> listFeed(@Query("moduleID") String moduleId);

    // e.g. Featured - http://www.disciplestoday.org/component/k2/itemlist?format=json&moduleID=353

    // data package is DT stuff...
}
