package scutmason.com.helloworld.utils;

import android.content.Context;
import android.util.DisplayMetrics;

/**
 * Created by mason on 2015/11/23.
 */
public class DensityUtils {
    public static int px2Dp(Context context,int px) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return Math.round(px / (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT));
    }

    public static int dp2Px(Context context,int dp) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return Math.round(dp * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT));
    }
}
