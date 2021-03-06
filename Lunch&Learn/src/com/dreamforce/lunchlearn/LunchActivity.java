package com.dreamforce.lunchlearn;

import java.util.UUID;

import android.support.v4.app.Fragment;

public class LunchActivity extends SingleFragmentActivity {
	@Override
    protected Fragment createFragment() {
        UUID crimeId = (UUID)getIntent()
            .getSerializableExtra(LunchFragment.EXTRA_LUNCH_ID);
        return LunchFragment.newInstance(crimeId);
    }
}
