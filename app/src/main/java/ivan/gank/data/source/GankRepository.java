package ivan.gank.data.source;


import io.reactivex.Flowable;
import io.reactivex.flowables.GroupedFlowable;
import ivan.gank.GankApp;
import ivan.gank.data.model.GankItemBean;
import ivan.gank.data.source.local.GankLocalDataSource;
import ivan.gank.data.source.remote.GankRemoteDataSource;
import ivan.gank.utils.NetworkUtils;


public enum GankRepository {
    INSTANCE;

    public Flowable<GankItemBean> queryCategory(String category, String count, int index) {
        return Flowable.just(NetworkUtils.isConnected(GankApp.INSTANCE))
                .groupBy(aBoolean -> {
                    if (aBoolean)
                        return GankRemoteDataSource.INSTANCE.queryCategory(category, count, index)
                                .doOnNext(GankLocalDataSource.INSTANCE::insert);
                    else
                        return GankLocalDataSource.INSTANCE.queryCategory(category, count, index);
                })
                .flatMap(GroupedFlowable::getKey)
                .filter(gankItemBean -> !category.equals("all") || !gankItemBean.getType().equals("福利"));
    }

}
