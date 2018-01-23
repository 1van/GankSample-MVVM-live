package ivan.gank.view.home;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.databinding.ObservableList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import ivan.gank.BR;
import ivan.gank.R;
import ivan.gank.data.model.GankItemBean;
import ivan.gank.data.source.GankRepository;
import me.tatarka.bindingcollectionadapter2.ItemBinding;

public class HomeViewModel extends AndroidViewModel {

    public final ObservableField<Drawable> tbBackground = new ObservableField<>();
    public final ObservableInt tabIndicatorColor = new ObservableInt(R.color.colorPrimary);
    public final ObservableInt tabSelectedTextColor = new ObservableInt(R.color.colorPrimary);
    public final ObservableList<GankItemBean> items = new ObservableArrayList<>();
    public ItemBinding<GankItemBean> itemBinding;

    public HomeViewModel(@NonNull Application application) {
        super(application);
        setTbBackground(application.getColor(R.color.colorPrimary));
    }

    public void refreshAll() {
        items.clear();
        itemBinding = ItemBinding.of(BR.item, R.layout.fragment_all_item);
        GankRepository.INSTANCE
                .queryCategory("all", "20", 1)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<List<GankItemBean>>() {
                    @Override
                    public void accept(List<GankItemBean> gankItemBeans) throws Exception {
                        items.addAll(gankItemBeans);
                    }
                });
    }

    public void refreshGirl() {
        items.clear();
        itemBinding = ItemBinding.of(BR.item, R.layout.fragment_girl_item);
        GankRepository.INSTANCE
                .queryCategory("福利", "20", 1)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<List<GankItemBean>>() {
                    @Override
                    public void accept(List<GankItemBean> gankItemBeans) throws Exception {
                        items.addAll(gankItemBeans);
                    }
                });
    }

    public void setTbBackground(int color) {
        tbBackground.set(new ColorDrawable(color));
    }

    public void setTabIndicatorColor(int color) {
        tabIndicatorColor.set(color);
    }

    public void setTabSelectedTextColor(int color) {
        tabSelectedTextColor.set(color);
    }

}
