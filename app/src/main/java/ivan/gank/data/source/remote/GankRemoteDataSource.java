package ivan.gank.data.source.remote;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import ivan.gank.data.model.GankItemBean;
import ivan.gank.data.source.GankDataSource;
import ivan.gank.data.source.local.GankLocalDataSource;


public enum GankRemoteDataSource implements GankDataSource {
    INSTANCE;

    private final GankRemoteService service;

    GankRemoteDataSource() {
        service = GankClient.INSTANT.obtain().create(GankRemoteService.class);
    }

    @Override
    public Flowable<List<GankItemBean>> queryCategory(String category, String count, int index) {
        return service.queryCategory(category, count, index)
                .flatMap(gankHttpResponse -> {
                    if (gankHttpResponse.isError())
                        return Flowable.error(new Throwable("服务器返回error"));
                    else
                        return Flowable.just(gankHttpResponse.getResults());
                })
                .doOnNext(GankLocalDataSource.INSTANCE::insert)
                .doOnError(throwable -> GankLocalDataSource.INSTANCE.queryCategory(category, count, index))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
