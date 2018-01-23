package ivan.gank.data.source.local;


import android.arch.persistence.room.Room;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.schedulers.Schedulers;
import ivan.gank.GankApp;
import ivan.gank.data.model.GankItemBean;
import ivan.gank.data.source.GankDataSource;

public enum GankLocalDataSource implements GankDataSource {
    INSTANCE;

    private final GankLocalService dao;

    GankLocalDataSource() {
        ObjectHelper.requireNonNull(GankApp.INSTANCE, "LocalDataSource is not initialized");
        GankDB db = Room.databaseBuilder(GankApp.INSTANCE, GankDB.class, GankDB.DB_NAME).build();
        dao = db.dao();
    }

    public void insert(List<GankItemBean> bean) {
        Flowable.just(bean)
                .subscribeOn(Schedulers.io())
                .subscribe(dao::insert);
    }

    @Override
    public Flowable<List<GankItemBean>> queryCategory(String category, String count, int index) {
        if (category.equals("all")) category = "%";
        return dao.queryCategory(category, count, index)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

}
