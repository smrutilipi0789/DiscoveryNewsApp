package com.smrutilipi.newsandroidapp.newsapp.data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.smrutilipi.newsandroidapp.newsapp.data.Favourite.FavoriteDao;
import com.smrutilipi.newsandroidapp.newsapp.data.Favourite.Favourite;
import com.smrutilipi.newsandroidapp.newsapp.data.Headline.Articles;
import com.smrutilipi.newsandroidapp.newsapp.data.Headline.NewsDao;


@Database(entities = {Articles.class, Favourite.class}, version = 10)
public abstract class AppDatabase extends RoomDatabase {

    public abstract NewsDao newsDao();

    public abstract FavoriteDao favoriteDao();

    public static AppDatabase getAppDatabase(Context context) {
        return Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "news-database")
            .allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .build();
    }
}
