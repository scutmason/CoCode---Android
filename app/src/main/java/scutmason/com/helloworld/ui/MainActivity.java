package scutmason.com.helloworld.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;
import scutmason.com.helloworld.CocodeFactory;
import scutmason.com.helloworld.R;
import scutmason.com.helloworld.adatper.CategoriesAdapter;
import scutmason.com.helloworld.api.CocodeApi;
import scutmason.com.helloworld.model.Categocies;
import scutmason.com.helloworld.model.Category;

public class MainActivity extends AppCompatActivity {
    public static final CocodeApi cocodeApi = CocodeFactory.getSingleton();
    private CompositeSubscription mCompositeSubscription;
    @Bind(R.id.lv_main)
    RecyclerView rv;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    private ArrayList<Category> categories;
    private CategoriesAdapter categoriesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initData();
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void initData() {
        categories = new ArrayList<>();
        categoriesAdapter = new CategoriesAdapter(this, categories);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(categoriesAdapter);
        getCategories();
    }

    private void getCategories() {
        cocodeApi.getCategories()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Categocies>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                        Toast.makeText(MainActivity.this, "服务器错误", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onNext(Categocies category) {
                        categories.clear();
                        categories.addAll(category.getCategoryList().getCategories());
                        categoriesAdapter.notifyDataSetChanged();
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
