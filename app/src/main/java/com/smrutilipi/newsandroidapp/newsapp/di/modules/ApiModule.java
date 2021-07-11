package com.smrutilipi.newsandroidapp.newsapp.di.modules;

import com.smrutilipi.newsandroidapp.newsapp.data.Headline.HeadlineApi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class ApiModule {

    @Provides
    @Singleton
    public HeadlineApi providesHeadlineApi(Retrofit retrofit) {
        return retrofit.create(HeadlineApi.class);
    }
}
