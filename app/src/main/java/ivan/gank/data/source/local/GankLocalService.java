package ivan.gank.data.source.local;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

import io.reactivex.Flowable;
import ivan.gank.data.model.GankItemBean;


@Dao
public interface GankLocalService {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(List<GankItemBean> bean);

    @Query("SELECT * FROM GankItemBean WHERE type LIKE :category  LIMIT :index,:count * :index")
    Flowable<List<GankItemBean>> queryCategory(String category, String count, int index);

}
