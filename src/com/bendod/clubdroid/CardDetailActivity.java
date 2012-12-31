package com.bendod.clubdroid;

import android.os.Bundle;
import com.actionbarsherlock.app.SherlockFragmentActivity;

public class CardDetailActivity extends SherlockFragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);

	  if (savedInstanceState == null) {
          // During initial setup, plug in the details fragment.
          CardDetailFragment details = new CardDetailFragment();
          details.setArguments(getIntent().getExtras());
          getSupportFragmentManager().beginTransaction().add(
                  android.R.id.content, details).commit();
      }
	  
	}
}
