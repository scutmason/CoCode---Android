package scutmason.com.helloworld.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by mason on 2015/11/25.
 */
public class TimeTranslate {

    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    public static String getTime(String time){
        String lastPostedAt;
        try {
            Date date = sdf.parse(time);
            lastPostedAt = SimpleDateFormat.getInstance().format(date);
        } catch (Exception e) {
            e.printStackTrace();
            lastPostedAt = "未知";
        }
        return lastPostedAt;
    }
}
