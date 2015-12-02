package scutmason.com.helloworld.utils;

import android.text.TextUtils;

/**
 * Created by mason on 2015/12/2.
 */
public class URLUtils {
    public static String imageUrlConverter(String source){
        if (!TextUtils.isEmpty(source)) {
            if (source.startsWith("//cocode.cc")) {
                return "http:" + source;
            } else {
                return "http://cocode.cc" + source;
            }
        }
        return "";
    }
}
