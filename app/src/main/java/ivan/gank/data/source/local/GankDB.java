package ivan.gank.data.source.local;


import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import ivan.gank.data.model.GankItemBean;


@Database(entities = {GankItemBean.class}, version = 1, exportSchema = false)
public abstract class GankDB extends RoomDatabase {

    public static final String DB_NAME = "gank.db";

    public abstract GankLocalService dao();

}

