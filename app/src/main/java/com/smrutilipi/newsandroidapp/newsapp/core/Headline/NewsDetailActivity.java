package com.smrutilipi.newsandroidapp.newsapp.core.Headline;

import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.support.customtabs.CustomTabsIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.smrutilipi.newsandroidapp.newsapp.R;
import com.smrutilipi.newsandroidapp.newsapp.Utils.Utils;
import com.smrutilipi.newsandroidapp.newsapp.data.AppDatabase;
import com.smrutilipi.newsandroidapp.newsapp.data.Headline.Articles;
import com.smrutilipi.newsandroidapp.newsapp.databinding.ActivityNewsDetailBinding;


public class NewsDetailActivity extends AppCompatActivity {

    private ActivityNewsDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_news_detail);
        Bundle bundle = getIntent().getExtras();
        assert bundle != null;
        if (bundle.getString("title") != null) {
            Articles currentArticle = AppDatabase.getAppDatabase(this).newsDao().getArticleString(bundle.getString("title"));
            binding.tvNewsDesc.setText(Utils.truncateExtra(currentArticle.content));
            Glide.with(this).load(currentArticle.urlToImage).into(binding.ivNewsImage);
            binding.tvNewsSource.setText(currentArticle.source.name);
            binding.tvNewsTitle.setText(currentArticle.title);
            binding.tvTime.setText(Utils.formattedDate(currentArticle.publishedAt));
            binding.btnReadFull.setOnClickListener(view -> {
                String url = currentArticle.url;
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                CustomTabsIntent customTabsIntent = builder.build();
                customTabsIntent.launchUrl(this, Uri.parse(url));
            });
        }
    }
}
