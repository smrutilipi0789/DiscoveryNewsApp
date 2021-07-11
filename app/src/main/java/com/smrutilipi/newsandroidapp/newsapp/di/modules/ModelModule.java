package com.smrutilipi.newsandroidapp.newsapp.di.modules;

import com.smrutilipi.newsandroidapp.newsapp.data.Headline.HeadlineService;
import com.smrutilipi.newsandroidapp.newsapp.data.Headline.HeadlineServiceImpl;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ModelModule {

    @Binds
    @Singleton
    abstract HeadlineService bindsHeadlineServiceModule(HeadlineServiceImpl headlineService);

}
