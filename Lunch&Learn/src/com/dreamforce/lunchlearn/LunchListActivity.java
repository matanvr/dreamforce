package com.dreamforce.lunchlearn;

import android.support.v4.app.Fragment;

public class LunchListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new LunchListFragment();
    }
}
