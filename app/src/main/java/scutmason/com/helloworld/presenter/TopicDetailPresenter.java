package scutmason.com.helloworld.presenter;

import android.app.Activity;
import android.view.View;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import scutmason.com.helloworld.CocodeFactory;
import scutmason.com.helloworld.api.CocodeApi;

/**
 *
 * Created by mason on 2015/11/25.
 */
public class TopicDetailPresenter {
    private Activity mActivity;
    private View mView;
    private final CocodeApi cocodeApi;

    public TopicDetailPresenter(Activity mActivity, View mView) {
        this.mActivity = mActivity;
        this.mView = mView;
        cocodeApi = CocodeFactory.getSingleton();
    }

    public void getTopicDetail(int topicID,int page){
        cocodeApi.getTopicDetail(topicID,page)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}

