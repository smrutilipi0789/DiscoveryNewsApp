package com.smrutilipi.newsandroidapp.newsapp.di.modules;

import android.content.Context;

import com.smrutilipi.newsandroidapp.newsapp.NewsMainApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AndroidModule {

    @Provides
    @Singleton
    Context providesContext() {
        return NewsMainApplication.context;
    }

}
