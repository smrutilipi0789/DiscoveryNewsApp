package com.smrutilipi.newsandroidapp.newsapp.data.CustomSearch;

import com.smrutilipi.newsandroidapp.newsapp.data.Headline.Articles;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

import lombok.Data;

@Data
public class CustomSearchResponse {

    public List<Articles> articles;
}
