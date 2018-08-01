package com.example.joe.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TourFragmentAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public TourFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FastForwardFragment();
        } else if (position == 1) {
            return new FutureEnergyFragment();
        } else if (position == 2) {
            return new ScienceStormsFragment();
        } else {
            return new U505Fragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.fast_forward_tour);
        } else if (position == 1) {
            return mContext.getString(R.string.future_energy_tour);
        } else if (position == 2) {
            return mContext.getString(R.string.science_tour);
        } else {
            return mContext.getString(R.string.u505_tour);
        }
    }
}
