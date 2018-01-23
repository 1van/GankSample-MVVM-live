package ivan.gank.data.source;


import java.util.List;

import io.reactivex.Flowable;
import ivan.gank.GankApp;
import ivan.gank.data.model.GankItemBean;
import ivan.gank.data.source.local.GankLocalDataSource;
import ivan.gank.data.source.remote.GankRemoteDataSource;
import ivan.gank.utils.NetworkUtils;

public enum GankRepository implements GankDataSource {
    INSTANCE;

    @Override
    public Flowable<List<GankItemBean>> queryCategory(String category, String count, int index) {
        if (NetworkUtils.isConnected(GankApp.INSTANCE))
            return GankRemoteDataSource.INSTANCE.queryCategory(category, count, index);
        else
            return GankLocalDataSource.INSTANCE.queryCategory(category, count, index);
    }

}
