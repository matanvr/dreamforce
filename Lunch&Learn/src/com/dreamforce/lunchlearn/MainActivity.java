package com.dreamforce.lunchlearn;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;


public class MainActivity extends FragmentActivity {


	    protected abstract Fragment createFragment();

	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_fragment);
	        FragmentManager manager = getSupportFragmentManager();
	        Fragment fragment = manager.findFragmentById(R.id.fragmentContainer);

	        if (fragment == null) {
	            fragment = createFragment();
	            manager.beginTransaction()
	                .add(R.id.fragmentContainer, fragment)
	                .commit();
	        }
	    }
}

	/*
	private CardContainer mCardContainer;
	SimpleCardStackAdapter adapter;
	int mCounter = 0;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);

		mCardContainer = (CardContainer) findViewById(R.id.layoutview);

		Resources r = getResources();

		adapter = new SimpleCardStackAdapter(this);

		adapter.add(new CardModel("Lunch with the CEO", "#Q&A, #innovate, #dreamjob", r.getDrawable(R.drawable.picture1)));
		adapter.add(new CardModel("Title2", "Description goes here", r.getDrawable(R.drawable.picture2)));
		adapter.add(new CardModel("Title3", "Description goes here", r.getDrawable(R.drawable.picture3)));
		adapter.add(new CardModel("Title4", "Description goes here", r.getDrawable(R.drawable.picture1)));

        CardModel cardModel = new CardModel("Title1", "Description goes here", r.getDrawable(R.drawable.picture1));
        cardModel.setOnClickListener(new CardModel.OnClickListener() {
           @Override
           public void OnClickListener() {
               Log.i("Swipeable Cards","I am pressing the card" + adapter.getCardModel(mCounter).getTitle());
               //start Activity 
               Intent intent = new Intent(MainActivity.this,EventActivity.class);
               //intent.putExtra("post", item"); make sure its serializable;
               startActivity(intent);

               
           }
        });

        cardModel.setOnCardDimissedListener(new CardModel.OnCardDimissedListener() {
            @Override
            public void onLike() {
                Log.i("Swipeable Cards","I like the card");
                mCounter++;
            }

            @Override
            public void onDislike() {
                Log.i("Swipeable Cards","I dislike the card");
                mCounter++;
            }
        });

        adapter.add(cardModel);

		mCardContainer.setAdapter(adapter);
	}/*

