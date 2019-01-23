package com.gushenge.testdemo.TaobaoNews;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.BindView;
import butterknife.ButterKnife;
import com.gushenge.testdemo.R;

public class NewsActivity extends AppCompatActivity {

    @BindView(R.id.news_list)
    AutoScrollView news;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        ButterKnife.bind(this);
        NewsAdapter adapter = new NewsAdapter();
        news.setAdapter(adapter);
    }
}