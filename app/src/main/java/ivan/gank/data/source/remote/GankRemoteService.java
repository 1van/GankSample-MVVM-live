package ivan.gank.data.source.remote;


import java.util.List;

import io.reactivex.Flowable;
import ivan.gank.data.model.GankHttpResponse;
import ivan.gank.data.model.GankItemBean;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface GankRemoteService {
    /**
     * 分类数据: http://gank.io/api/data/数据类型/请求个数/第几页
     * •数据类型： 福利 | Android | iOS | 休息视频 | 拓展资源 | 前端 | all
     * •请求个数： 数字，大于0
     * •第几页：数字，大于0
     * <p>
     * 例：•http://gank.io/api/data/Android/10/1
     * •http://gank.io/api/data/福利/10/1
     * •http://gank.io/api/data/iOS/20/2
     * •http://gank.io/api/data/all/20/2
     * <p>
     * 每日数据： http://gank.io/api/day/年/月/日
     * <p>
     * 例：
     * •http://gank.io/api/day/2015/08/06
     * <p>
     * 随机数据：http://gank.io/api/random/data/分类/个数
     * •数据类型：福利 | Android | iOS | 休息视频 | 拓展资源 | 前端
     * •个数： 数字，大于0
     * <p>
     * 例：•http://gank.io/api/random/data/Android/20
     */

    @GET("data/{category}/{count}/{index}")
    Flowable<GankHttpResponse<List<GankItemBean>>> queryCategory(
            @Path("category") String category,
            @Path("count") String count,
            @Path("index") int index
    );

}
