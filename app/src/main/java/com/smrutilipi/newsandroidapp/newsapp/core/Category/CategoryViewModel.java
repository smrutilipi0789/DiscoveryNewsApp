package com.smrutilipi.newsandroidapp.newsapp.core.Category;

import android.annotation.SuppressLint;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.util.Log;
import android.view.View;

import com.smrutilipi.newsandroidapp.newsapp.data.Headline.Articles;
import com.smrutilipi.newsandroidapp.newsapp.data.Headline.HeadlineService;

import java.util.List;

import javax.inject.Inject;

public class CategoryViewModel extends ViewModel {

    private final HeadlineService headlineService;
    private MutableLiveData<Integer> progress = new MutableLiveData<>();
    private MutableLiveData<List<Articles>> articles = new MutableLiveData<>();

    @Inject
    public CategoryViewModel(HeadlineService headlineService) {
        this.headlineService = headlineService;
    }

    @SuppressLint("CheckResult")
    public LiveData<List<Articles>> headlineByCategory(String category) {
        headlineService.getCustomHeadline(category)
                .doOnSubscribe(disposable -> progress.setValue(View.VISIBLE))
                .doFinally(() -> progress.setValue(View.GONE))
                .subscribe(response -> {
                            articles.setValue(response.articles);
                        }
                        , error -> Log.i("SearchViewModel.class", "HeadlineByCategory: " + error));
        return articles;
    }

    public LiveData<Integer> getProgress() {
        return progress;
    }
}
