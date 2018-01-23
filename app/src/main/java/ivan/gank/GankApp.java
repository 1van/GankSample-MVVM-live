package ivan.gank;


import android.app.Application;


public class GankApp extends Application {

    public static GankApp INSTANCE;

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
    }

}
