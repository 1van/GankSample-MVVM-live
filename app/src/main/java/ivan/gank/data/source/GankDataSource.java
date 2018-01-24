package ivan.gank.data.source;


import io.reactivex.Flowable;
import ivan.gank.data.model.GankItemBean;


public interface GankDataSource {

    Flowable<GankItemBean> queryCategory(
            String category, String count, int index);

}
