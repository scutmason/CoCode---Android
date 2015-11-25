package scutmason.com.helloworld;

import scutmason.com.helloworld.api.CocodeApi;

/**
 * Created by drakeet on 8/9/15.
 * modified by jiajun on 9/22/15
 */
public class CocodeFactory {

    protected static final Object monitor = new Object();
    static CocodeApi sSingleton = null;

    public static CocodeApi getSingleton() {
        synchronized (monitor) {
            if (sSingleton == null) {
                sSingleton = new CocodeRetrofit().getService();
            }
            return sSingleton;
        }
    }
}
