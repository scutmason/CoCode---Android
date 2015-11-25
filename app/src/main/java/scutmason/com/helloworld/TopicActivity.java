package scutmason.com.helloworld;

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
import scutmason.com.helloworld.adatper.TopicsAdapter;
import scutmason.com.helloworld.api.CocodeApi;
import scutmason.com.helloworld.model.Category;
import scutmason.com.helloworld.model.LastestModel;
import scutmason.com.helloworld.model.Topic;
import scutmason.com.helloworld.model.User;

public class TopicActivity extends AppCompatActivity {
    public static final CocodeApi cocodeApi = CocodeFactory.getSingleton();
    public static final String CATEGORY = "category";
    public static final String TITLE = "TITLE";
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        category = bundle.getString(CATEGORY);
        toolbar.setTitle(bundle.getString(TITLE));
        topics = new ArrayList<>();
        user = new ArrayList<>();
        topicsAdapter = new TopicsAdapter(this, topics,user);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(topicsAdapter);
        getCategories();
    }

    private void getCategories() {
        cocodeApi.getTopic(category)
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
                        topics.clear();
                        topics.addAll(lastest.getTopicList().getTopics());
                        user.clear();
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
