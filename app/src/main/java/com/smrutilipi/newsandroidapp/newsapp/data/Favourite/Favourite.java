package com.smrutilipi.newsandroidapp.newsapp.data.Favourite;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.smrutilipi.newsandroidapp.newsapp.data.Headline.Articles;
import com.smrutilipi.newsandroidapp.newsapp.data.Headline.Source;

import lombok.Data;

@Data
@Entity(tableName = "favourites")
public class Favourite {

    @PrimaryKey(autoGenerate = true)
    public int idFavourite;

    @Embedded(prefix = "article")
    public Articles articles;
}

