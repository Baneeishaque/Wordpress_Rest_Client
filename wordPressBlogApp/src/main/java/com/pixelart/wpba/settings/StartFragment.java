package com.pixelart.wpba.settings ;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.pixelart.wpba.R;


public class StartFragment extends PreferenceFragment {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		addPreferencesFromResource(R.xml.pref_start);
    }
}
