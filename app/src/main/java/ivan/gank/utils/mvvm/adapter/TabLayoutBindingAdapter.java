package ivan.gank.utils.mvvm.adapter;


import android.databinding.BindingAdapter;
import android.graphics.Color;
import android.support.design.widget.TabLayout;


public class TabLayoutBindingAdapter {

    @BindingAdapter("tabIndicatorColor")
    public static void setSelectedTabIndicatorColor(TabLayout layout, int color) {
        layout.setSelectedTabIndicatorColor(color);
    }

    @BindingAdapter("tabSelectedTextColor")
    public static void setTabTextColors(TabLayout layout, int color) {
        layout.setTabTextColors(Color.GRAY, color);
    }

}
