package scutmason.com.helloworld.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;
import scutmason.com.helloworld.CocodeFactory;
import scutmason.com.helloworld.R;
import scutmason.com.helloworld.adatper.EndlessRecyclerOnScrollListener;
import scutmason.com.helloworld.adatper.TopicDetailAdapter;
import scutmason.com.helloworld.adatper.TopicsAdapter;
import scutmason.com.helloworld.api.CocodeApi;
import scutmason.com.helloworld.model.LastestModel;
import scutmason.com.helloworld.model.Post;
import scutmason.com.helloworld.model.Topic;
import scutmason.com.helloworld.model.TopicDetail;
import scutmason.com.helloworld.model.User;

public class TopicActivity extends AppCompatActivity {
    public static final CocodeApi cocodeApi = CocodeFactory.getSingleton();
    public static final String CATEGORY = "category";
    public static final String TITLE = "TITLE";
    public static final int TOPIC = 0;
    public static final int TOPICDETAIL = 1;
    public static final String FLAG = "FLAG";
    public static final String TOPICID = "TOPICID";
    private CompositeSubscription mCompositeSubscription;
    @Bind(R.id.lv_main)
    RecyclerView rv;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    private ArrayList<Topic> topics;
    private TopicsAdapter topicsAdapter;
    private String category;
    private List<User> user;
    private Bundle bundle;
    private int topicid;
    private int pageSize;
    private TopicDetailAdapter tda;
    private ArrayList<Post> topicDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic);
        ButterKnife.bind(this);
        initData();
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void initData() {
        bundle = getIntent().getExtras();
        rv.setLayoutManager(new LinearLayoutManager(this));
        switch (bundle.getInt(FLAG)) {
            case TOPIC:
                category = bundle.getString(CATEGORY);
                toolbar.setTitle(bundle.getString(TITLE));
                topics = new ArrayList<>();
                user = new ArrayList<>();
                topicsAdapter = new TopicsAdapter(this, topics, user);
                topicsAdapter.setHasMoreDataAndFooter(true, true);
                rv.addOnScrollListener(new EndlessRecyclerOnScrollListener((LinearLayoutManager) rv.getLayoutManager()) {
                    @Override
                    public void onLoadMore(int current_page) {
                        getCategories(current_page);
                    }
                });
                rv.setAdapter(topicsAdapter);
                getCategories(0);
                break;
            case TOPICDETAIL:
                topicid = bundle.getInt(TOPICID);
                toolbar.setTitle(R.string.topic_detial);
                topicDetail = new ArrayList<>();
                tda = new TopicDetailAdapter(this, topicDetail);
                rv.setAdapter(tda);
                rv.addOnScrollListener(new EndlessRecyclerOnScrollListener((LinearLayoutManager) rv.getLayoutManager()) {
                    @Override
                    public void onLoadMore(int current_page) {
                        if (current_page <= pageSize) {
                            getTpoicDetail(topicid, current_page);
                        } else {
                            tda.setHasFooter(false);
                            tda.setHasMoreData(false);
                        }
                    }
                });
                getTpoicDetail(topicid, 1);
                break;
        }

    }

    private void getTpoicDetail(int topicid, final int page) {
        cocodeApi.getTopicDetail(topicid, page)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<TopicDetail>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                        Toast.makeText(TopicActivity.this, "服务器错误", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onNext(TopicDetail topicDetail) {
                        if (page == 1) {
                            TopicActivity.this.topicDetail.clear();
                        }
                        int count = topicDetail.getPostsCount();
                        int chunkSize = topicDetail.getChunkSize();
                        pageSize = count / 20 + (count % chunkSize == 0 ? 0 : 1);
                        TopicActivity.this.topicDetail.addAll(topicDetail.getPostStream().getPosts());
                        if (pageSize > 1) {
                            tda.setHasMoreDataAndFooter(true, true);
                        }
                        tda.setTitleText(topicDetail.getFancyTitle());
                        tda.notifyDataSetChanged();
                    }
                });
    }

    private void getCategories(final int page) {
        cocodeApi.getTopic(category, page)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<LastestModel>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                        Toast.makeText(TopicActivity.this, "服务器错误", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onNext(LastestModel lastest) {
                        if (page == 0) {
                            topics.clear();
                            user.clear();
                        }
                        if (lastest.getTopicList().getTopics().isEmpty())
                            topicsAdapter.setHasMoreDataAndFooter(false, false);
                        topics.addAll(lastest.getTopicList().getTopics());
                        user.addAll(lastest.getUsers());
                        topicsAdapter.notifyDataSetChanged();
                    }
                });
    }


    public void addSubscription(Subscription s) {
        if (this.mCompositeSubscription == null) {
            this.mCompositeSubscription = new CompositeSubscription();
        }
        this.mCompositeSubscription.add(s);
    }

}
