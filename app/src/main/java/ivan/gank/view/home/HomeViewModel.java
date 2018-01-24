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

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import ivan.gank.R;
import ivan.gank.data.model.GankItemBean;
import ivan.gank.data.source.GankRepository;
import me.tatarka.bindingcollectionadapter2.ItemBinding;


public class HomeViewModel extends AndroidViewModel {

    public final ObservableInt color = new ObservableInt(R.color.colorPrimary);
    public final ObservableField<Drawable> tbBackground = new ObservableField<>();
    public final ObservableList<GankItemBean> items = new ObservableArrayList<>();
    private final CompositeDisposable mDisposable = new CompositeDisposable();
    public ItemBinding<GankItemBean> itemBinding;

    public HomeViewModel(@NonNull Application application) {
        super(application);
        setTbBackground(application.getColor(R.color.colorPrimary));
    }

    public void setItemBinding(ItemBinding<GankItemBean> itemBinding) {
        this.itemBinding = itemBinding;
    }

    public void refreshAll() {
        mDisposable.add(
                GankRepository.INSTANCE
                        .queryCategory("all", "20", 1)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(items::add)
        );

    }

    public void refreshGirl() {
        mDisposable.add(
                GankRepository.INSTANCE
                        .queryCategory("福利", "20", 1)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(items::add)
        );

    }

    public void setTbBackground(int color) {
        tbBackground.set(new ColorDrawable(color));
    }

    public void setColor(int color) {
        this.color.set(color);
    }

    public void onStop() {
        mDisposable.clear();
    }

}
