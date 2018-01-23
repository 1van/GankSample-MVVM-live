package ivan.gank.view.home;


import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import ivan.gank.R;
import ivan.gank.databinding.ActivityHomeBinding;
import ivan.gank.utils.ArrayLinkedHashMap;
import ivan.gank.view.home.fragment.AllFragment;
import ivan.gank.view.home.fragment.GirlFragment;


public class HomeActivity extends AppCompatActivity {

    private ActivityHomeBinding binding;
    private HomeViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_home);
        viewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        binding.setViewModel(viewModel);

        setActionBar(binding.toolbar);

        ArrayLinkedHashMap<Fragment, String> fragments = new ArrayLinkedHashMap<>();
        fragments.put(new AllFragment(), "News");
        fragments.put(new GirlFragment(), "福利哟～");

        binding.viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public int getCount() {
                return fragments.size();
            }

            @Override
            public Fragment getItem(int position) {
                return fragments.get(position).getKey();
            }

            @Nullable
            @Override
            public CharSequence getPageTitle(int position) {
                return fragments.get(position).getValue();
            }

        });
        binding.tabLayout.setupWithViewPager(binding.viewPager);
        binding.viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        setColor(getColor(R.color.colorPrimary));
                        break;
                    case 1:
                        setColor(getColor(R.color.colorAccent));
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        viewModel.onStop();
    }

    private void setColor(int color) {
        viewModel.setTbBackground(color);
        viewModel.setTabIndicatorColor(color);
        viewModel.setTabSelectedTextColor(color);
        getWindow().setStatusBarColor(color);
    }

}
