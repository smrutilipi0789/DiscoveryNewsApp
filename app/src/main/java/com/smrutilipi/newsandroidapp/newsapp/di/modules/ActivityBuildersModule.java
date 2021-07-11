package com.smrutilipi.newsandroidapp.newsapp.di.modules;

import com.smrutilipi.newsandroidapp.newsapp.NewsMainActivity;
import com.smrutilipi.newsandroidapp.newsapp.core.Category.CategoryFragment;
import com.smrutilipi.newsandroidapp.newsapp.core.Favourite.FavouriteFragment;
import com.smrutilipi.newsandroidapp.newsapp.core.Headline.HeadlineFragment;
import com.smrutilipi.newsandroidapp.newsapp.core.Headline.NewsDetailActivity;
import com.smrutilipi.newsandroidapp.newsapp.core.Search.SearchFragment;
import com.smrutilipi.newsandroidapp.newsapp.core.Setttings.SettingsActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector
    abstract NewsMainActivity contributesNewsMainActivity();

    @ContributesAndroidInjector
    abstract NewsDetailActivity contributesNewsDetailActivity();

    @ContributesAndroidInjector
    abstract FavouriteFragment contributesFavouriteFragment();

    @ContributesAndroidInjector
    abstract HeadlineFragment contributesHeadlineFragment();

    @ContributesAndroidInjector
    abstract SearchFragment contributesSearchFragment();

    @ContributesAndroidInjector
    abstract CategoryFragment contributesCategoryFragment();

    @ContributesAndroidInjector
    abstract SettingsActivity contributesSettingsActivity();
}
