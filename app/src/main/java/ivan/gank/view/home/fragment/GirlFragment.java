package ivan.gank.view.home.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import ivan.gank.BR;
import ivan.gank.R;
import ivan.gank.view.home.BaseFragment;
import me.tatarka.bindingcollectionadapter2.ItemBinding;


public class GirlFragment extends BaseFragment {

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        viewModel.setItemBinding(ItemBinding.of(BR.item, R.layout.fragment_girl_item));
        super.onViewCreated(view, savedInstanceState);
        viewModel.refreshGirl();
    }

}
