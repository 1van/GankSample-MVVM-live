package ivan.gank.data.source;


import java.util.List;

import io.reactivex.Flowable;
import ivan.gank.data.model.GankItemBean;


public interface GankDataSource {

    Flowable<List<GankItemBean>> queryCategory(
            String category, String count, int index);

}
