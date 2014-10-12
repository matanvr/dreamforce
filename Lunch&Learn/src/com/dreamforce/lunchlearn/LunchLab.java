package com.dreamforce.lunchlearn;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import android.content.Context;

public class LunchLab {
    private ArrayList<Lunch> mLunches;

    private static LunchLab sLunchLab;
    private Context mAppContext;

    private LunchLab(Context appContext) {
        mAppContext = appContext;
        mLunches = new ArrayList<Lunch>();
        for (int i = 0; i < 100; i++) {
            Lunch c = new Lunch();
            c.setmTitle("Lunch #" + i);
            c.setmDate(new Date());
            c.setmDescription("#dreamforce");
            
            mLunches.add(c);
        }
    }

    public static LunchLab get(Context c) {
        if (sLunchLab == null) {
            sLunchLab = new LunchLab(c.getApplicationContext());
        }
        return sLunchLab;
    }

    public Lunch getLunch(UUID id) {
        for (Lunch c : mLunches) {
            if (c.getmId().equals(id))
                return c;
        }
        return null;
    }
    
    public ArrayList<Lunch> getLunches() {
        return mLunches;
    }
}

