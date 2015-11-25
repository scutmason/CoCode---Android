package scutmason.com.helloworld;

import android.app.Application;

import me.drakeet.library.CrashWoodpecker;

/**
 * Created by Administrator on 2015/9/23.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
//        CrashWoodpecker.fly().to(this);
    }
}
