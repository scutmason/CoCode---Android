package scutmason.com.helloworld.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.squareup.picasso.Picasso;

import java.io.IOException;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;
import scutmason.com.helloworld.R;
import scutmason.com.helloworld.ui.wiget.PhotoView;
import scutmason.com.helloworld.utils.URLUtils;

/**
 * 看大图
 * Created by mason on 2015/12/2.
 */
public class PhotoActivity extends BaseActivity {
    private PhotoView mPhotoView;
    public static final String PHOTO_DOWNLOAD_URL = "photo-download-url";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);
        initializeView();
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String mDownloadUrl = bundle.getString(PHOTO_DOWNLOAD_URL);
            String url = URLUtils.imageUrlConverter(mDownloadUrl);
            setPhoto(url);
        }
    }

    protected void initializeView() {
        mPhotoView = (PhotoView) findViewById(R.id.photo_view);
        mPhotoView.setMaxInitialScale(5);
        mPhotoView.setFullScreen(false, false);
        mPhotoView.enableImageTransforms(false);
    }

    private void setPhoto(final String url) {

        Observable.just(url)
                .map(new Func1<String, Bitmap>() {
                    @Override
                    public Bitmap call(String s) {
                        try {
                            return Picasso.with(PhotoActivity.this).load(url).get();
                        } catch (IOException e) {
                            e.printStackTrace();
                            return null;
                        }
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<Bitmap>() {
                    @Override
                    public void call(Bitmap bitmap) {
                        if (bitmap == null) {
                            return;
                        }
                        mPhotoView.bindPhoto(bitmap);
                        mPhotoView.enableImageTransforms(true);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        throwable.printStackTrace();
                    }
                });
    }
}
