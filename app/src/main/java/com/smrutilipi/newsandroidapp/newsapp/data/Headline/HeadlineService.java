package com.smrutilipi.newsandroidapp.newsapp.data.Headline;

import com.smrutilipi.newsandroidapp.newsapp.data.CustomSearch.CustomSearchResponse;
import com.smrutilipi.newsandroidapp.newsapp.data.Settings.SettingsResponse;

import io.reactivex.Observable;
import io.reactivex.annotations.NonNull;
import retrofit2.Response;

public interface HeadlineService {

    @NonNull
    Observable<HeadlineResponse> getHeadline(String headlineRequest);

    @NonNull
    Observable<CustomSearchResponse> getCustomSearchReponse(String query);

    @NonNull
    Observable<HeadlineResponse> getCustomHeadline(String category);

    @NonNull
    Observable<SettingsResponse> getSources();
}
