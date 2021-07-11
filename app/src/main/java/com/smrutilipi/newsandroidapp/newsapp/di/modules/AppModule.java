package com.smrutilipi.newsandroidapp.newsapp.di.modules;

import dagger.Module;

@Module(includes = {ModelModule.class, NetworkModule.class, AndroidModule.class, ViewModelModule.class
})
public class AppModule {

}
