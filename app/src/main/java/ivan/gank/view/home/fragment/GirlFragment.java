package ivan.gank.view.home.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.view.View;

import ivan.gank.view.home.BaseFragment;

public class GirlFragment extends BaseFragment {

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        viewModel.refreshGirl();
        binding.rv.setLayoutManager(new GridLayoutManager(getContext(), 1));
        super.onViewCreated(view, savedInstanceState);
    }
}
