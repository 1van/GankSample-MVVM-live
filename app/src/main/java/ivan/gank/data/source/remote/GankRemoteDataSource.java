package ivan.gank.data.source.remote;


import io.reactivex.Flowable;
import ivan.gank.data.model.GankItemBean;
import ivan.gank.data.source.GankDataSource;


public enum GankRemoteDataSource implements GankDataSource {
    INSTANCE;

    private final GankRemoteService service;

    GankRemoteDataSource() {
        service = GankClient.INSTANT.obtain().create(GankRemoteService.class);
    }

    @Override
    public Flowable<GankItemBean> queryCategory(String category, String count, int index) {
        return service.queryCategory(category, count, index)
                .flatMap(gankHttpResponse -> {
                    if (gankHttpResponse.isError())
                        return Flowable.error(new Throwable("服务器返回error"));
                    else
                        return Flowable.just(gankHttpResponse.getResults());
                }).flatMap(Flowable::fromIterable);
    }
}
