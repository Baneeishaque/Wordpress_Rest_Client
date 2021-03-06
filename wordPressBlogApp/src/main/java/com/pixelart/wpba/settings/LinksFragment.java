package com.pixelart.wpba.settings;

import com.pixelart.wpba.R;
import com.pixelart.wpba.SettingsActivity;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.view.MenuItem;


public class LinksFragment extends PreferenceFragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.pref_links);
		
		setHasOptionsMenu(true);
		((SettingsActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId()) {
		case android.R.id.home:
			getActivity().onBackPressed();
			return true;
		}
		return false;
	}

}
