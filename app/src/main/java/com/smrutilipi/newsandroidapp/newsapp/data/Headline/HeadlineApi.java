package com.smrutilipi.newsandroidapp.newsapp.data.Headline;


import com.smrutilipi.newsandroidapp.newsapp.data.CustomSearch.CustomSearchResponse;
import com.smrutilipi.newsandroidapp.newsapp.data.Settings.SettingsResponse;

import io.reactivex.Observable;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface HeadlineApi {

    @GET("top-headlines")
    Observable<HeadlineResponse> getHeadlines(@Query(value = "country") String country,
                                              @Query(value = "apiKey") String apiKey);

    @GET("top-headlines")
    Observable<HeadlineResponse> getHeadlinesFiltered(
            @Query(value = "sources") String sources,
            @Query(value = "apiKey") String apiKey);


    @GET("top-headlines")
    Observable<HeadlineResponse> getHeadlinesFilteredByCategory(
            @Query(value = "category") String category,
            @Query(value = "apiKey") String apiKey,
            @Query(value = "country") String country);


    @GET("top-headlines")
    Observable<CustomSearchResponse> getSearchResponse(@Query(value = "q") String query,
                                                       @Query(value = "apiKey") String apiKey);
    @GET("sources")
    Observable<SettingsResponse> getSourcesResponse(@Query(value = "apiKey") String apiKey,
                                                    @Query(value = "country") String country);

}
