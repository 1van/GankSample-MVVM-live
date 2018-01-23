package ivan.gank.data.source.remote;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


public enum GankClient {
    INSTANT;

    private static final String HOST = "http://gank.io/api/";

    private OkHttpClient client;
    private Retrofit retrofit;

    public Retrofit obtain() {
        if (client == null) {
            client = new OkHttpClient.Builder()
                    .connectTimeout(9, TimeUnit.SECONDS)
                    .build();
        }
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(HOST)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
