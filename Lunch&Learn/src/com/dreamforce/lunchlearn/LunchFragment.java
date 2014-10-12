package com.dreamforce.lunchlearn;

import java.util.UUID;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LunchFragment extends Fragment {
    public static final String EXTRA_LUNCH_ID = "criminalintent.LUNCH_ID";

    Lunch mLunch;
	TextView mTitleField;
    TextView mDate;
    TextView mLocation;

    public static LunchFragment newInstance(UUID LunchId) {
        Bundle args = new Bundle();
        args.putSerializable(EXTRA_LUNCH_ID, LunchId);

        LunchFragment fragment = new LunchFragment();
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        UUID lunchId = (UUID)getArguments().getSerializable(EXTRA_LUNCH_ID);
        mLunch = LunchLab.get(getActivity()).getLunch(lunchId);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_event, parent, false);
        
        mTitleField = (TextView)v.findViewById(R.id.title);
        mTitleField.setText(mLunch.getmTitle());
        
        mDate = (TextView)v.findViewById(R.id.time);
        mDate.setText(mLunch.getmDate().toString());





        
        return v; 
    }
}
