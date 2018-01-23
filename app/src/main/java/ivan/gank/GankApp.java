package ivan.gank;

import android.app.Application;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import ivan.gank.data.source.local.GankLocalService;


public class GankApp extends Application {

    public static GankApp INSTANCE;

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
    }

}
